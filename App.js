var app=angular.module('myApp',['ngRoute']);

app.config(function($routeProvider){
	$routeProvider
	
	.when('/Login',{
		templateurl:'c_user/Login.html',
		controller:'UserController'
	})
	.when('/register',{
		templateurl:'c_user/register.html',
		controller:'UserController'
	})
	.when('/aboutus',{
		templateurl:'c_user/About.html',
		controller:'AboutUsController'
	})
	
});

