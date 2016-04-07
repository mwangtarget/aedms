angular.module('aedmsGuiApp')
.factory('EngineOprListService', function ($resource) {
    return $resource('http://localhost:8081/aedms-core/engines/:engine/engineOprRecs/:engineOprRec', {engine:"@engine",engineOprRec:"@engineOprRec"});
});
