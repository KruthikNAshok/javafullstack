class PassportSevaRunner{
	
	
	public static void main(String args[]){
	boolean userIsRegistered=PassportSevaValidator.validateUser("kruthik","Ashok","kruthik@123","kruthik@123");
	System.out.println("is user registered:"+userIsRegistered);
	
	if(userIsRegistered){
	PassportSeva.getUserInfo();
	}
	}

}