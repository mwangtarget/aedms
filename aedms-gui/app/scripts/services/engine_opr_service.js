angular.module('aedmsGuiApp')
.factory('EngineOprService', function ($resource) {
    return $resource('http://localhost:8081/aedms-core/engineOprRecs/:engineOprRec', {engineOprRec: "@engineOprRec"});
});
