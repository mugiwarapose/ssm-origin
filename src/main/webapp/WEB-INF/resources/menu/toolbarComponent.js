/**
 * Created by pose on 2017/6/11.
 */
var toolbarApp = angular.module('toolbarApp',[]);

toolbarApp.component('toolbarComponent',{
    templateUrl:'views/toobar.html',
    controller:['$scope','toolbarService',function ($scope,toolbarService) {
        var data  = toolbarService.query();
        $scope.toolbars = data;
    }]
})