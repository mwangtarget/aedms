'use strict';

/**
 * @ngdoc function
 * @name aedmsGuiApp.controller:apuCtrl
 * @description
 * # apuCtrl
 * Controller of the aedmsGuiApp
 */
angular.module('aedmsGuiApp')
   .controller('APUCtrl', ['$scope','$rootScope', '$location', '$uibModal','APUService', function ($scope, $rootScope, $location, $uibModal,APUService) {
     
      
      APUService.get(function(response) {
      
         $scope.apus = response._embedded.aPUs;
         console.log("Get apus " + JSON.stringify($scope.apus));
      });
      
    

    /**
     * Initial data of new apu
     */
    $scope.newAPU = {"model": "", "sn": ""};

    /**
     * Create apu function
     * @param newAPU
     */
    $scope.newapusubmited = false;
    $scope.createapu = function (newAPU) {
        var apu = new APUService(newAPU);
        apu.model = newAPU.model;
        apu.sn = newAPU.sn;
        apu.$save(function (u, putResponseHeaders) {
            $scope.apus.push(u);
            $scope.isCollapsed = true;
            $scope.newAPU.model = "";
            $scope.newAPU.sn = "";
        });
    };

    /**
     * Controler for handling modal actions
     * @param $scope
     * @param $uibModalInstance
     * @param newAPU
     * @constructor
     */
    var ModalInstanceCtrl = function ($scope, $uibModalInstance, newAPU) {
        $scope.newAPU = newAPU;
        $scope.ok = function () {
            $uibModalInstance.close($scope.newAPU);
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
            templateUrl: 'views/modals/create_apu.html',
            controller: ModalInstanceCtrl,
            resolve: {
                newAPU: function () {
                    return $scope.newAPU;
                }
            }
        });
        uibModalInstance.result.then(function (newAPU) {
            $scope.createapu(newAPU);
        }, function () {
        });
    };

    /**
     * Cancel dialog
     */
    $scope.cancel = function () {
        $scope.newAPU.model = "";
        $scope.newAPU.sn = "";
    };

    /**
     * Remove apu
     * @param apu
     */
    $scope.removeAPU = function (apu) {
        APUService.delete({"apu": apu._links.self.href.split('/').pop()}, function (data) {
             APUService.get(function(response) {
      
                       $scope.apus = response._embedded.aPUs;
                       console.log("Get apus Post delete " + JSON.stringify($scope.apus));
             });
        });
    };

    $scope.query = "";

}]);
