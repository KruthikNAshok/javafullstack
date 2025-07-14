class Tyre {

    static String brand;
    static String type;
    static int sizeInInches;
    static boolean isTubeless;
    static double price;
    static String suitableFor;

    public static boolean registerTyre(String br, String ty, int size, boolean tubeless, double pr, String vehicleType) {

        boolean isTyreRegistered = false;

        boolean brandValid = false;
        boolean typeValid = false;
        boolean sizeValid = false;
        boolean tubelessValid = false;
        boolean priceValid = false;
        boolean suitableForValid = false;

        if (br != null) {
            brand = br;
            brandValid = true;
        } else {
            System.out.println("Enter valid brand");
        }

        if (ty != null) {
            type = ty;
            typeValid = true;
        } else {
            System.out.println("Enter valid type");
        }

        if (size > 0) {
            sizeInInches = size;
            sizeValid = true;
        } else {
            System.out.println("Enter valid size in inches");
        }

        isTubeless = tubeless;
        tubelessValid = true;

        if (pr > 0) {
            price = pr;
            priceValid = true;
        } else {
            System.out.println("Enter valid price");
        }

        if (vehicleType != null) {
            suitableFor = vehicleType;
            suitableForValid = true;
        } else {
            System.out.println("Enter valid vehicle type");
        }

        if (brandValid && typeValid && sizeValid && tubelessValid && priceValid && suitableForValid) {
            isTyreRegistered = true;
        } else {
            System.out.println("Tyre is not registered");
        }

        return isTyreRegistered;
    }

    public static void getTyreInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size (in inches): " + sizeInInches);
        System.out.println("Tubeless: " + isTubeless);
        System.out.println("Price: ₹" + price);
        System.out.println("Suitable For: " + suitableFor);
    }
}
