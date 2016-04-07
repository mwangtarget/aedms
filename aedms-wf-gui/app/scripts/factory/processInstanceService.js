angular.module('activitiApp').factory('ProcessInstanceService', function ($resource) {
    var data = $resource('aedms-wf/process-instance/:processInstance', {processInstance: "@processInstance"});
    return data;
});
