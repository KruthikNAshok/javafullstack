class Doctor{

public static void treatment(String patientName,int age,long contactNum,String email,String disease){
System.out.println("started assisting");
Nurse.assist(patientName,age,contactNum,email,disease);

System.out.println("assisting done");

}
}