class LibraryMembership {
    static String memberName;
    static String membershipType;

    public static boolean registerMember(String name, String type) {
        boolean isMemberRegistered = false;
        boolean nameValid = false;
        boolean typeValid = false;

        if (name != null) {
            memberName = name;
            nameValid = true;
        }

        if (type != null) {
            membershipType = type;
            typeValid = true;
        }

        if (nameValid == true && typeValid == true) {
            isMemberRegistered = true;
        }

        return isMemberRegistered;
    }

    public static void getMemberInfo() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
    }
}