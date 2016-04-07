angular.module('activitiApp').factory('GroupService', function ($resource) {
    var data = $resource('aedms-wf/identity/groups/:group', {group: "@group"});
    return data;
});
