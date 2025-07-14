class HospitalRunner{

public static void main(String appolo[]){
System.out.println("main stred");

//invoking meth/functionality/behaviour

String patientName="radha";
int age=19;
long contactNum=3213223233l;
String email="kuri@gmail.com";
/*String disease="fever";*/
Hospital.checkup(patientName,age,contactNum,email,"fever");

System.out.println("main ended");


}
}