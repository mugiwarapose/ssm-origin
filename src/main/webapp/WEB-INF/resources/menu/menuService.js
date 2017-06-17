/**
 * Created by pose on 2017/6/11.
 */
myApp.factory('toolbarService',['$resource',function ($resource) {
    return $resource('http://192.168.3.2:8080/origin/parentMenu' ,{},{
        query:{
            method:'GET',
            isArray:true
        }
    });
}])