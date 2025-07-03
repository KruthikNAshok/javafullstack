class HospitalMethod {

    public static void main(String[] args) {
        generalDoctors("Dr. Sharma", "Dr. Mehta");
        surgeons("Dr. Reddy", "Dr. Bose");
        pediatricians("Dr. Rao", "Dr. Desai");
        dentists("Dr. Patil", "Dr. Nair");
    }

    public static void generalDoctors(String doc1, String doc2) {
        System.out.println( doc1 +  doc2);
    }

    public static void surgeons(String doc1, String doc2) {
        System.out.println( doc1 +  doc2);
    }

    public static void pediatricians(String doc1, String doc2) {
        System.out.println( doc1 + doc2);
    }

    public static void dentists(String doc1, String doc2) {
        System.out.println( doc1 + doc2);
    }
}
