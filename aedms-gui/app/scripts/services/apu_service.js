'use strict';

/**
 * @ngdoc function
 * @name aedmsGuiApp.service:APUServie
 * @description
 * # EngineService
 * Controller of the aedmsGuiApp
 */
angular.module('aedmsGuiApp')
.factory('APUService', function ($resource) {
    return $resource('http://localhost:8081/aedms-core/aPUs/:apu', {apu: "@apu"});
});
