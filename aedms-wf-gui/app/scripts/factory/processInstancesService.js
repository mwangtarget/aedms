angular.module('activitiApp').factory('ProcessInstancesService', function ($resource) {
    var data = $resource('aedms-wf/runtime/process-instances/:processInstance', {processInstance: "@processInstance"});
    return data;
});
