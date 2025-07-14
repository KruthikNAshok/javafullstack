class LibraryMembershipRunner {
    public static void main(String args[]) {
        boolean registered = LibraryMembership.registerMember("Sneha Rao", "Premium");
        System.out.println("Is member registered: " + registered);

        LibraryMembership.getMemberInfo();
    }
}