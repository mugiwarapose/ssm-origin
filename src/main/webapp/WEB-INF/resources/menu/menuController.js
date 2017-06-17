/**
 * Created by pose on 2017/6/11.
 */
myApp.controller('toolbarCtrl',['$scope','toolbarService',function ($scope,toolbarService) {
    var data  = toolbarService.query();
    $scope.toolbars = data;
}])