class HospitalLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String doctor1 = "Dr. Ravi Kumar - Cardiologist";
        String doctor2 = "Dr. Anita Sharma - Neurologist";
        String doctor3 = "Dr. Shyam Sundar - Orthopedic";
        String doctor4 = "Dr. Meera Iyer - Pediatrician";
        String doctor5 = "Dr. Arvind Rao - Dermatologist";
        String doctor6 = "Dr. Sneha Patil - ENT Specialist";
        String doctor7 = "Dr. Rajesh Nair - General Surgeon";
        String doctor8 = "Dr. Kavitha Reddy - Gynecologist";
        String doctor9 = "Dr. Vinay Shetty - Urologist";
        String doctor10 = "Dr. Asha Pai - Psychiatrist";

        String[] doctorNames = {
            doctor1, doctor2, doctor3, doctor4, doctor5,
            doctor6, doctor7, doctor8, doctor9, doctor10
        };

        System.out.println("Hospital - Doctor Names:");
        for (String doctor : doctorNames) {
            System.out.println(doctor);
        }

        System.out.println("main ended");
    }
}
