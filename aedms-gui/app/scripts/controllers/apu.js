'use strict';

/**
 * @ngdoc function
 * @name aedmsGuiApp.controller:EngineCtrl
 * @description
 * # EngineCtrl
 * Controller of the aedmsGuiApp
 */
angular.module('aedmsGuiApp')
   .controller('APUCtrl', ['$scope','APUService', function ($scope, EngineService) {
  	  $scope.enginesList = {};
  	  $scope.engines = {};

      APUService.get(function(response) {
      
         $scope.enginesList = response._embedded.engines;
      });

      APUService.get({engine:1},function(response) {
      
         $scope.engines = response;
      });

   }]);