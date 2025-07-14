class PassportSeva{
	
	static String givenName;
	static String surName;
	static String password;
	static String confirmPassword;
	
	
	public static void getUserInfo(){
		
		System.out.println("the given name is:"+PassportSevaValidator.givenName);
		System.out.println("the sur name is:"+PassportSevaValidator.surName);
		System.out.println("the given password is:"+PassportSevaValidator.password);
        System.out.println("confirm password is " + PassportSevaValidator.confirmPassword);		

		
	}
	
}