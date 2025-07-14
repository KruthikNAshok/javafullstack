class Tailor {

    static String name;
    static String shopName;
    static String location;
    static int yearsOfExperience;
    static boolean doesHomeService;
    static String specialization;

    public static boolean registerTailor(String nm, String shop, String loc, int experience, boolean homeService, String spec) {

        boolean isTailorRegistered = false;

        boolean nameValid = false;
        boolean shopNameValid = false;
        boolean locationValid = false;
        boolean experienceValid = false;
        boolean homeServiceValid = false;
        boolean specializationValid = false;

        if (nm != null) {
            name = nm;
            nameValid = true;
        } else {
            System.out.println("Enter valid tailor name");
        }

        if (shop != null) {
            shopName = shop;
            shopNameValid = true;
        } else {
            System.out.println("Enter valid shop name");
        }

        if (loc != null) {
            location = loc;
            locationValid = true;
        } else {
            System.out.println("Enter valid location");
        }

        if (experience >= 0) {
            yearsOfExperience = experience;
            experienceValid = true;
        } else {
            System.out.println("Enter valid experience");
        }

        doesHomeService = homeService;
        homeServiceValid = true;

        if (spec != null) {
            specialization = spec;
            specializationValid = true;
        } else {
            System.out.println("Enter valid specialization");
        }

        if (nameValid && shopNameValid && locationValid && experienceValid && homeServiceValid && specializationValid) {
            isTailorRegistered = true;
        } else {
            System.out.println("Tailor is not registered");
        }

        return isTailorRegistered;
    }

    public static void getTailorInfo() {
        System.out.println("Name: " + name);
        System.out.println("Shop Name: " + shopName);
        System.out.println("Location: " + location);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Provides Home Service: " + doesHomeService);
        System.out.println("Specialization: " + specialization);
    }
}
