'use strict';

/**
 * @ngdoc This is the controlers for AirCraft
 * @name aedmsGuiApp.controller:AirCraftCtrl
 * @description
 * # AirCraft Controller
 * Controller of the aedmsGuiApp
 */

angular.module('aedmsGuiApp')
        .controller('AirCraftCtrl', ['AirCraftService', 'AirCraftHelper', function (AirCraftService, AirCraftHelper) {
            var main = this;

            main.apus = AirCraftService.getAPUs();
            main.engines = AirCraftService.getEngines();
            main.airCrafts = AirCraftService.getAirCrafts();
            main.typesIndex = AirCraftHelper.buildIndex(main.apus, 'name');
            main.statusesIndex = AirCraftHelper.buildIndex(main.engines, 'name');

            main.setCurrentAirCraft = function (airCraft) {
                main.currentAirCraft = airCraft;
                main.currentStatus = main.statusesIndex[airCraft.status];
                main.currentType = main.typesIndex[airCraft.type];
            };

            main.createAirCraft = function () {
                main.airCrafts.push({
                    title: 'New AirCraft',
                    description: 'Description pending.',
                    criteria: 'Criteria pending.',
                    status: 'Back Log',
                    type: 'Feature',
                    reporter: 'Pending',
                    assignee: 'Pending'
                });
            };

            main.setCurrentStatus = function (status) {
                if (typeof main.currentAirCraft !== 'undefined') {
                    main.currentAirCraft.status = status.name;
                }
            };

            main.setCurrentType = function (type) {
                if (typeof main.currentAirCraft !== 'undefined') {
                    main.currentAirCraft.type = type.name;
                }
            };
        }])
        .directive('airCraft', function () {
            return {
                scope: true,
                replace: true,
                template: '<div><h4>{{airCraft.title}}</h4><p>{{airCraft.description}}</p></div>'
            };
        });