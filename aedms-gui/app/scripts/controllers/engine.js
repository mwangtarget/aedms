'use strict';

/**
 * @ngdoc function
 * @name aedmsGuiApp.controller:EngineCtrl
 * @description
 * # EngineCtrl
 * Controller of the aedmsGuiApp
 */
angular.module('aedmsGuiApp')
  .controller('EngineCtrl', ['$scope','EngineService', function ($scope, EngineService) {
  	  $scope.enginesList = {};
  	  $scope.engines = {};

      EngineService.get(function(response) {
      
         $scope.enginesList = response._embedded.engines;
      });

      EngineService.get({engine:1},function(response) {
      
         $scope.engines = response;
      });
     // HTTP module
     // $http.get('http://localhost/aedms-core/engines/').success(function(data) {
     //          $scope.engines = data._embedded.engines;
     //          console.log("Got "+ $scope.engines.length+ " Engines");
     //    });

  }])
