class PassportSevaValidator{
  static String givenName;
  static String surName;
  static String password;
  static String confirmPassword;
  
  
  public static boolean validator(String gName,String sName,String pwd,String cPwd){
   boolean isUserValid=false;
   boolean gNameValid=false;
   boolean sNameValid=false;
   boolean pwdValid=false;
   boolean cPwdValid=false;
   
   if(gName!=null){
			
		givenName=gName;
		givenNameValid=true;
		}else{
			
			System.out.println("give valid user name");
		}
		
		if(sName!=null){
			
			surName=sName;
			surNameValid=true;
			
		}else{
			
			System.out.println("give valid sur name");
		}
		
		if(pwd!=null){
			password=pwd;
			passwordValid=true;
			
		}else{
			System.out.println("password should not be empty");
		}
		if(cpwd!=null){
			confirmPassword=pwd;
			confirmPasswordValid=true;
			
		}else{
			System.out.println("password should not be empty");	
   }
   if(gNameValid==true && sNameValid==true && pwdValid==true && cPwdValid==true){
	   System.out.println("user validated");
   }
   return isUserValid 
}
