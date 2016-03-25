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
            'ngTouch',
            'ui.bootstrap'
        ])
        .config(function ($routeProvider) {
            $routeProvider
                    .when('/', {
                        templateUrl: 'views/main.html',
                        controller: 'MainCtrl',
                        controllerAs: 'mainCtrl'
                    })
                    .when('/engines', {
                        templateUrl: 'views/engines.html',
                        controller: 'EngineCtrl',
                        controllerAs: 'engineCtrl'
                    })
                    .when('/apus', {
                        templateUrl: 'views/apus.html',
                        controller: 'APUCtrl',
                        controllerAs: 'apuCtrl'
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
