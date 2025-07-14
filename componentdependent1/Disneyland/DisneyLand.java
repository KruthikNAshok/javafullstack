class DisneyLand {

    static String location;
    static String country;
    static int numberOfRides;
    static boolean hasWaterPark;
    static double entryFee;
    static String openingHours;

    public static boolean registerDisneyLand(String loc, String ctry, int rides, boolean waterPark, double fee, String hours) {

        boolean isDisneyLandRegistered = false;

        boolean locationValid = false;
        boolean countryValid = false;
        boolean ridesValid = false;
        boolean waterParkValid = false;
        boolean feeValid = false;
        boolean hoursValid = false;

        if (loc != null) {
            location = loc;
            locationValid = true;
        } else {
            System.out.println("Enter valid location");
        }

        if (ctry != null) {
            country = ctry;
            countryValid = true;
        } else {
            System.out.println("Enter valid country");
        }

        if (rides > 0) {
            numberOfRides = rides;
            ridesValid = true;
        } else {
            System.out.println("Enter valid number of rides");
        }

        hasWaterPark = waterPark;
        waterParkValid = true;

        if (fee >= 0) {
            entryFee = fee;
            feeValid = true;
        } else {
            System.out.println("Enter valid entry fee");
        }

        if (hours != null) {
            openingHours = hours;
            hoursValid = true;
        } else {
            System.out.println("Enter valid opening hours");
        }

        if (locationValid && countryValid && ridesValid && waterParkValid && feeValid && hoursValid) {
            isDisneyLandRegistered = true;
        } else {
            System.out.println("DisneyLand is not registered");
        }

        return isDisneyLandRegistered;
    }

    public static void getDisneyLandInfo() {
        System.out.println("Location: " + location);
        System.out.println("Country: " + country);
        System.out.println("Number of Rides: " + numberOfRides);
        System.out.println("Has Water Park: " + hasWaterPark);
        System.out.println("Entry Fee: ₹" + entryFee);
        System.out.println("Opening Hours: " + openingHours);
    }
}
