'use strict';

/**
 * @ngdoc function
 * @name aedmsGuiApp.controller:EngineCtrl
 * @description
 * # EngineCtrl
 * Controller of the aedmsGuiApp
 */
angular.module('aedmsGuiApp')
.factory('EngineService', function ($resource) {
    var data = $resource('http://localhost:8080/engines/');
    return data;
});
