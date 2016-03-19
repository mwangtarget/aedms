'use strict';

/**
 * @ngdoc overview
 * @name aedmsGuiApp
 * @description
 * # aedmsGuiApp
 *
 * Main module of the application.
 */
angular
        .module('aedmsGuiApp', [
            'ngAnimate',
            'ngCookies',
            'ngResource',
            'ngRoute',
            'ngSanitize',
            'ngTouch'
        ])
        .config(function ($routeProvider) {
            $routeProvider
                    .when('/', {
                        templateUrl: 'views/main.html',
                        controller: 'EngineCtrl',
                        controllerAs: 'engineCtrl'
                    })
                    .when('/aircrafts', {
                        templateUrl: 'views/aircrafts.html',
                        controller: 'AirCraftCtrl',
                        controllerAs: 'aircrafts'
                    })
                    .when('/about', {
                        templateUrl: 'views/about.html',
                        controller: 'AboutCtrl',
                        controllerAs: 'about'
                    })
                    .otherwise({
                        redirectTo: '/'
                    });
        });
