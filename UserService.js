'use strict';
app.factory('UserService',['$http','$q','rootScope',function($http,$q,$rootScope){
	console.log("Userservice..")
	var Base_URL='http://localhost:8070/Groupniit'
		return{
		createuser:function(){
			return $http.get(BASE_URL+'/createusers/')
			.then(
					function(response)
					{
						return response.data;
					},
					function(errResponse){
						console.error('error while fetching users');
						return $q.reject(errResponse);
					});
					
		},
	}
}])