'use strict';

describe('Controller: EngineCtrl', function () {

  // load the controller's module
  beforeEach(module('aedmsGuiApp'));

  var EngineCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    EngineCtrl = $controller('EngineCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(EngineCtrl.awesomeThings.length).toBe(3);
  });
});
