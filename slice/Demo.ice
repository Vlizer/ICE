
#ifndef SR_DEMO_ICE
#define SR_DEMO_ICE


#include <Ice/BuiltinSequences.ice> 

module Demo
{
	exception RequestCanceledException
	{
	};

	interface Calc
	{
		float add1(float a, float b);	
	};
	
	

	struct Name
	{
		string firstName;
		string lastName;
	};
	
	interface User
	{
		long getId();
		Name getName();
		void changeName(Name name1); 	
	};
	
	sequence<User*> Users;
	
	interface UserManagement
	{
		User* createUser();
		Users findUsers(string template);
	};

};

#endif
