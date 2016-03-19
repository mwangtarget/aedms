'use strict';

/**
 * @ngdoc function
 * @name aedmsGuiApp.controller:EngineCtrl
 * @description
 * # EngineCtrl
 * Controller of the aedmsGuiApp
 */
angular.module('aedmsGuiApp')
  .config(['$httpProvider', function($httpProvider) {
        $httpProvider.defaults.useXDomain = true;
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
    }
  ])
  .controller('EngineCtrl', function ($scope, $resource) {
  	var data = $resource('http://localhost:8080/engines/');
    $scope.engines = data.get();
  });
