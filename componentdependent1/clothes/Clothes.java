class Clothes {

    static String brand;
    static String type;
    static String size;
    static String color;
    static double price;
    static boolean isAvailable;

    public static boolean registerClothes(String br, String ty, String sz, String clr, double pr, boolean available) {

        boolean isClothesRegistered = false;

        boolean brandValid = false;
        boolean typeValid = false;
        boolean sizeValid = false;
        boolean colorValid = false;
        boolean priceValid = false;
        boolean availabilityValid = false;

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

        if (sz != null) {
            size = sz;
            sizeValid = true;
        } else {
            System.out.println("Enter valid size");
        }

        if (clr != null) {
            color = clr;
            colorValid = true;
        } else {
            System.out.println("Enter valid color");
        }

        if (pr > 0) {
            price = pr;
            priceValid = true;
        } else {
            System.out.println("Enter valid price");
        }

        isAvailable = available;
        availabilityValid = true;

        if (brandValid && typeValid && sizeValid && colorValid && priceValid && availabilityValid) {
            isClothesRegistered = true;
        } else {
            System.out.println("Clothes are not registered");
        }

        return isClothesRegistered;
    }

    public static void getClothesInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + isAvailable);
    }
}
