angular.module('activitiApp').factory('FormDataService', function ($resource) {
    var data = $resource('aedms-wf/form/form-data', {}, {
        startTask: {method:'GET',  params: {processDefinitionId: "@processDefinitionId"}}
    });
    return data;
});