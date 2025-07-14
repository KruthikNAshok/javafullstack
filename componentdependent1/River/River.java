class River {

    static String name;
    static String origin;
    static String destination;
    static double lengthInKm;
    static boolean isPerennial;
    static String country;

    public static boolean registerRiver(String nm, String org, String dest, double length, boolean perennial, String ctry) {

        boolean isRiverRegistered = false;

        boolean nameValid = false;
        boolean originValid = false;
        boolean destinationValid = false;
        boolean lengthValid = false;
        boolean perennialValid = false;
        boolean countryValid = false;

        if (nm != null) {
            name = nm;
            nameValid = true;
        } else {
            System.out.println("Enter valid river name");
        }

        if (org != null) {
            origin = org;
            originValid = true;
        } else {
            System.out.println("Enter valid origin");
        }

        if (dest != null) {
            destination = dest;
            destinationValid = true;
        } else {
            System.out.println("Enter valid destination");
        }

        if (length > 0) {
            lengthInKm = length;
            lengthValid = true;
        } else {
            System.out.println("Enter valid river length");
        }

        isPerennial = perennial;
        perennialValid = true;

        if (ctry != null) {
            country = ctry;
            countryValid = true;
        } else {
            System.out.println("Enter valid country");
        }

        if (nameValid && originValid && destinationValid && lengthValid && perennialValid && countryValid) {
            isRiverRegistered = true;
        } else {
            System.out.println("River is not registered");
        }

        return isRiverRegistered;
    }

    public static void getRiverInfo() {
        System.out.println("River Name: " + name);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Length (in km): " + lengthInKm);
        System.out.println("Is Perennial: " + isPerennial);
        System.out.println("Country: " + country);
    }
}
