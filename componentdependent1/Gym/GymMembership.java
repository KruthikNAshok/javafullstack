class GymMembership {
    static String memberName;
    static String planType;

    public static boolean enrollMember(String name, String plan) {
        boolean isEnrolled = false;
        boolean nameValid = false;
        boolean planValid = false;

        if (name != null) {
            memberName = name;
            nameValid = true;
        }

        if (plan != null) {
            planType = plan;
            planValid = true;
        }

        if (nameValid == true && planValid == true) {
            isEnrolled = true;
        }

        return isEnrolled;
    }

    public static void getMemberDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Plan Type: " + planType);
    }
}
