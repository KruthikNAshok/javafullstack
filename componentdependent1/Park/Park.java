class Park {

    static String name;
    static String location;
    static double areaInAcres;
    static boolean hasPlayArea;
    static int numberOfBenches;
    static String openingHours;

    public static boolean registerPark(String nm, String loc, double area, boolean playArea, int benches, String hours) {

        boolean isParkRegistered = false;

        boolean nameValid = false;
        boolean locationValid = false;
        boolean areaValid = false;
        boolean playAreaValid = false;
        boolean benchesValid = false;
        boolean hoursValid = false;

        if (nm != null) {
            name = nm;
            nameValid = true;
        } else {
            System.out.println("Enter valid park name");
        }

        if (loc != null) {
            location = loc;
            locationValid = true;
        } else {
            System.out.println("Enter valid location");
        }

        if (area > 0) {
            areaInAcres = area;
            areaValid = true;
        } else {
            System.out.println("Enter valid area in acres");
        }

        hasPlayArea = playArea;
        playAreaValid = true;

        if (benches >= 0) {
            numberOfBenches = benches;
            benchesValid = true;
        } else {
            System.out.println("Enter valid number of benches");
        }

        if (hours != null) {
            openingHours = hours;
            hoursValid = true;
        } else {
            System.out.println("Enter valid opening hours");
        }

        if (nameValid && locationValid && areaValid && playAreaValid && benchesValid && hoursValid) {
            isParkRegistered = true;
        } else {
            System.out.println("Park is not registered");
        }

        return isParkRegistered;
    }

    public static void getParkInfo() {
        System.out.println("Park Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Area in Acres: " + areaInAcres);
        System.out.println("Has Play Area: " + hasPlayArea);
        System.out.println("Number of Benches: " + numberOfBenches);
        System.out.println("Opening Hours: " + openingHours);
    }
}
