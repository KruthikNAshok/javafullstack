class Gold {

    static String purity;
    static double weightInGrams;
    static String ornamentType;
    static String hallmarkNumber;
    static double pricePerGram;
    static boolean isAvailable;

    public static boolean registerGold(String pur, double wt, String type, String hallNo, double price, boolean available) {

        boolean isGoldRegistered = false;

        boolean purityValid = false;
        boolean weightValid = false;
        boolean typeValid = false;
        boolean hallmarkValid = false;
        boolean priceValid = false;
        boolean availableValid = false;

        if (pur != null) {
            purity = pur;
            purityValid = true;
        } else {
            System.out.println("Enter valid purity (e.g., 22K, 24K)");
        }

        if (wt > 0) {
            weightInGrams = wt;
            weightValid = true;
        } else {
            System.out.println("Enter valid weight");
        }

        if (type != null) {
            ornamentType = type;
            typeValid = true;
        } else {
            System.out.println("Enter valid ornament type");
        }

        if (hallNo != null) {
            hallmarkNumber = hallNo;
            hallmarkValid = true;
        } else {
            System.out.println("Enter valid hallmark number");
        }

        if (price > 0) {
            pricePerGram = price;
            priceValid = true;
        } else {
            System.out.println("Enter valid price per gram");
        }

        isAvailable = available;
        availableValid = true;

        if (purityValid && weightValid && typeValid && hallmarkValid && priceValid && availableValid) {
            isGoldRegistered = true;
        } else {
            System.out.println("Gold is not registered");
        }

        return isGoldRegistered;
    }

    public static void getGoldInfo() {
        System.out.println("Purity: " + purity);
        System.out.println("Weight in Grams: " + weightInGrams);
        System.out.println("Ornament Type: " + ornamentType);
        System.out.println("Hallmark Number: " + hallmarkNumber);
        System.out.println("Price per Gram: ₹" + pricePerGram);
		
	}
}