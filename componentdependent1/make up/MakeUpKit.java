class MakeUpKit {

    static String brand;
    static int numberOfItems;
    static boolean isWaterproof;
    static String colorTheme;
    static double price;
    static String bagType;

    public static boolean registerMakeUpKit(String br, int items, boolean waterproof, String theme, double pr, String bag) {

        boolean isKitRegistered = false;

        boolean brandValid = false;
        boolean itemsValid = false;
        boolean waterproofValid = false;
        boolean themeValid = false;
        boolean priceValid = false;
        boolean bagValid = false;

        if (br != null) {
            brand = br;
            brandValid = true;
        } else {
            System.out.println("Enter valid brand name");
        }

        if (items > 0) {
            numberOfItems = items;
            itemsValid = true;
        } else {
            System.out.println("Enter valid number of items");
        }

        isWaterproof = waterproof;
        waterproofValid = true;

        if (theme != null) {
            colorTheme = theme;
            themeValid = true;
        } else {
            System.out.println("Enter valid color theme");
        }

        if (pr > 0) {
            price = pr;
            priceValid = true;
        } else {
            System.out.println("Enter valid price");
        }

        if (bag != null) {
            bagType = bag;
            bagValid = true;
        } else {
            System.out.println("Enter valid bag type");
        }

        if (brandValid && itemsValid && waterproofValid && themeValid && priceValid && bagValid) {
            isKitRegistered = true;
        } else {
            System.out.println("MakeUpKit is not registered");
        }

        return isKitRegistered;
    }

    public static void getMakeUpKitInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Items: " + numberOfItems);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Color Theme: " + colorTheme);
        System.out.println("Price: ₹" + price);
        System.out.println("Bag Type: " + bagType);
    }
}
