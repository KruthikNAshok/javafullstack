class HospitalStatic {

    static String doctor1 = "Dr. Ravi Kumar - Cardiologist";
    static String doctor2 = "Dr. Anita Sharma - Neurologist";
    static String doctor3 = "Dr. Shyam Sundar - Orthopedic";
    static String doctor4 = "Dr. Meera Iyer - Pediatrician";
    static String doctor5 = "Dr. Arvind Rao - Dermatologist";
    static String doctor6 = "Dr. Sneha Patil - ENT Specialist";
    static String doctor7 = "Dr. Rajesh Nair - General Surgeon";
    static String doctor8 = "Dr. Kavitha Reddy - Gynecologist";
    static String doctor9 = "Dr. Vinay Shetty - Urologist";
    static String doctor10 = "Dr. Asha Pai - Psychiatrist";

    static String[] doctorNames = {
        doctor1, doctor2, doctor3, doctor4, doctor5,
        doctor6, doctor7, doctor8, doctor9, doctor10
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Hospital - Doctor Names:");
        for (String doctor : doctorNames) {
            System.out.println(doctor);
        }

        System.out.println("main ended");
    }
}
