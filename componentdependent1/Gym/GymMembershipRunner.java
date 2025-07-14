class GymMembershipRunner {
    public static void main(String args[]) {
        boolean enrolled = GymMembership.enrollMember("Rajeev Reddy", "Annual");
        System.out.println("Is member enrolled: " + enrolled);

        GymMembership.getMemberDetails();
    }
}