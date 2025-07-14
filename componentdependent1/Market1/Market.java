class Market {

    static String name;
    static String location;
    static int numberOfShops;
    static boolean isOpen;
    static String marketType;
    static String openingHours;

    public static boolean registerMarket(String nm, String loc, int shops, boolean open, String type, String hours) {

        boolean isMarketRegistered = false;

        boolean nameValid = false;
        boolean locationValid = false;
        boolean shopsValid = false;
        boolean openValid = false;
        boolean typeValid = false;
        boolean hoursValid = false;

        if (nm != null) {
            name = nm;
            nameValid = true;
        } else {
            System.out.println("Enter valid market name");
        }

        if (loc != null) {
            location = loc;
            locationValid = true;
        } else {
            System.out.println("Enter valid market location");
        }

        if (shops > 0) {
            numberOfShops = shops;
            shopsValid = true;
        } else {
            System.out.println("Enter valid number of shops");
        }

        isOpen = open;
        openValid = true;

        if (type != null) {
            marketType = type;
            typeValid = true;
        } else {
            System.out.println("Enter valid market type");
        }

        if (hours != null) {
            openingHours = hours;
            hoursValid = true;
        } else {
            System.out.println("Enter valid opening hours");
        }

        if (nameValid && locationValid && shopsValid && openValid && typeValid && hoursValid) {
            isMarketRegistered = true;
        } else {
            System.out.println("Market is not registered");
        }

        return isMarketRegistered;
    }

    public static void getMarketInfo() {
        System.out.println("Market Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Shops: " + numberOfShops);
        System.out.println("Is Open: " + isOpen);
        System.out.println("Market Type: " + marketType);
        System.out.println("Opening Hours: " + openingHours);
    }
}
