'use strict';

/**
 * @ngdoc This is the services for AirCraft
 * @name  aedmsGuiApp.controller:AirCraftService
 * @description
 * # AirCraft Service
 * Controller of the aedmsGuiApp
 */

angular.module('aedmsGuiApp')
        .factory('AirCraftHelper', function () {
            var buildIndex = function (source, property) {
                var tempArray = [];
                for (var i = 0, len = source.length; i < len; ++i) {
                    tempArray[source[i][property]] = source[i];
                }
                return tempArray;
            };
            return {
                buildIndex: buildIndex
            };
        })
        .service('AirCraftService',  ['EngineService', function (EngineService) {   
            var engines = [];
          
            EngineService.get(function(response) {
      
              engines = response._embedded.engines;
            });

            var service = this,
                    apus = [
                        {name: 'Feature'},
                        {name: 'Enhancement'},
                        {name: 'Bug'},
                        {name: 'Spike'}
                    ],
                    aircrafts = [
                        {
                            title: 'Boin 777',
                            description: 'Our first story.',
                            criteria: 'Criteria pending.',
                            status: 'To Do',
                            type: 'Feature',
                            reporter: 'Lukas Ruebbelke',
                            assignee: 'Brian Ford'
                        },
                        {
                            title: 'Second story',
                            description: 'Do something.',
                            criteria: 'Criteria pending.',
                            status: 'Back Log',
                            type: 'Feature',
                            reporter: 'Lukas Ruebbelke',
                            assignee: 'Brian Ford'
                        },
                        {
                            title: 'Another story',
                            description: 'Just one more.',
                            criteria: 'Criteria pending.',
                            status: 'Code Review',
                            type: 'Enhancement',
                            reporter: 'Lukas Ruebbelke',
                            assignee: 'Brian Ford'
                        }
                    ],
                    engines = [{fleet: "A"},
                               {fleet: "B"}
                    ];


            service.getEngines = function () {
                return engines;
            };

            service.getAPUs = function () {
                return apus;
            };

            service.getAirCrafts = function () {
                return aircrafts;
            };
        }]);