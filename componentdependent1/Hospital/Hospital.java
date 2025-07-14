
 /*hospital.checkup(patientname,age,mob,email,sickness)
doctor.treatmnt(patname,age)
nurse.assist(patnname)*/

class Hospital{
	
public static void checkup(String patientName,int age,long contactNum,String email,String disease){
	
System.out.println("checkup started");

Doctor.treatment(patientName,age,contactNum,email,disease);

System.out.println("checkup ended");

}

}
