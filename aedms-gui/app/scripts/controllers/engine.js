'use strict';

/**
 * @ngdoc function
 * @name aedmsGuiApp.controller:EngineCtrl
 * @description
 * # EngineCtrl
 * Controller of the aedmsGuiApp
 */
angular.module('aedmsGuiApp')
   .controller('EngineCtrl', ['$scope','$rootScope', '$location', '$uibModal','EngineService', function ($scope, $rootScope, $location, $uibModal,EngineService) {
  	 
      
      EngineService.get(function(response) {
      
         $scope.engines = response._embedded.engines;
         console.log("Get Engines " + JSON.stringify($scope.engines));
      });
      
    

    /**
     * Initial data of new Engine
     */
    $scope.newEngine = {"fleet": "", "subFleet": ""};

    /**
     * Create Engine function
     * @param newEngine
     */
    $scope.newEngineSubmited = false;
    $scope.createEngine = function (newEngine) {
        var engine = new EngineService(newEngine);
        engine.fleet = newEngine.fleet;
        engine.subFleet = newEngine.subFleet;
        engine.$save(function (u, putResponseHeaders) {
            $scope.engines.push(u);
            $scope.isCollapsed = true;
            $scope.newEngine.fleet = "";
            $scope.newEngine.subFleet = "";
        });
    };

    /**
     * Controler for handling modal actions
     * @param $scope
     * @param $uibModalInstance
     * @param newEngine
     * @constructor
     */
    var ModalInstanceCtrl = function ($scope, $uibModalInstance, newEngine) {
        $scope.newEngine = newEngine;
        $scope.ok = function () {
            $uibModalInstance.close($scope.newEngine);
        };
        $scope.cancel = function () {
            $uibModalInstance.dismiss('cancel');
        };
    };

    /**
     * Open Modal
     */
    $scope.open = function () {
        var uibModalInstance = $uibModal.open({
            templateUrl: 'views/modals/create_engine.html',
            controller: ModalInstanceCtrl,
            resolve: {
                newEngine: function () {
                    return $scope.newEngine;
                }
            }
        });
        uibModalInstance.result.then(function (newEngine) {
            $scope.createEngine(newEngine);
        }, function () {
        });
    };

    /**
     * Cancel dialog
     */
    $scope.cancel = function () {
        $scope.newEngine.fleet = "";
        $scope.newEngine.subFleet = "";
    };

    /**
     * Remove Engine
     * @param engine
     */
    $scope.removeEngine = function (engine) {
        EngineService.delete({"engine": engine._links.self.href.split('/').pop()}, function (data) {
             EngineService.get(function(response) {
      
                       $scope.engines = response._embedded.engines;
                       console.log("Get Engines Post delete " + JSON.stringify($scope.engines));
             });
        });
    };

    $scope.query = "";

      /**
     * Groups edit dialog
     */
    var ModalEngineOprInstanceCtrl = function ($scope, $uibModalInstance, engine, EngineOprService, EngineOprListService) {
        $scope.engine = engine;
        $scope.ok = function () {
            $uibModalInstance.close(engine);
        };
        $scope.cancel = function () {
            $uibModalInstance.dismiss('cancel');
        };

        function reloadEngineOprs() {
             EngineOprListService.get({"engine": engine._links.self.href.split('/').pop()}, function(response){
             	$scope.engineOprList = response._embedded.engineOprRecs;
             });
        }

        $scope.removeEngineOpr = function (engine_opr) {
            EngineOprService.delete({"engineOprRec":engine_opr._links.self.href.split('/').pop()}, function () {
                reloadEngineOprs();
            });
        }

        reloadEngineOprs();

        EngineOprService.get(function(response){
        	$scope.engineOprs = response._embedded.engineOprRecs;
        });

        function clearSelection() {
            $scope.selected = undefined;
        }

        $scope.onSelect = function ($item, $model, $label) {
            $scope.addEngineOprError = false;
            var engineOprListService = new EngineOprListService();
            engineOprListService.engineId = $item.id;
            engineOprListService.$save({"engine": engine._links.self.href.split('/').pop()}, function () {
                clearSelection();
                reloadEngineOprs();
            }, function () {
                $scope.addEngineOprError = true;
            });
        };

        clearSelection();

    }

    $scope.showEngineOprList = function (engine) {
        var uibModalInstance = $uibModal.open({
            templateUrl: 'views/modals/engine_oprs.html',
            controller: ModalEngineOprInstanceCtrl,
            resolve: {
                engine: function () {
                    return engine;
                }
            }
        });
        uibModalInstance.result.then(function (newEngine) {}, function () {});
    };


}]);
