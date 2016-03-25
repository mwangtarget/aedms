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

}]);
