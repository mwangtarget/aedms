angular.module('activitiApp').factory('UserService', function ($resource) {
    var data = $resource('aedms-wf/identity/users/:user', {user: "@user", size: 100});
    return data;
});
