'use strict';

/**
 * @ngdoc function
 * @name aedmsGuiApp.service:EngineServie
 * @description
 * # EngineService
 * Controller of the aedmsGuiApp
 */
angular.module('aedmsGuiApp')
.factory('EngineService', function ($resource) {
    return $resource('http://localhost/aedms-core/engines/:engine', {engine: "@engine"});
});
