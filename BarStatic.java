class BarStatic {

    static String alcohol1 = "Whiskey";
    static String alcohol2 = "Vodka";
    static String alcohol3 = "Rum";
    static String alcohol4 = "Gin";
    static String alcohol5 = "Tequila";
    static String alcohol6 = "Brandy";
    static String alcohol7 = "Wine";
    static String alcohol8 = "Beer";
    static String alcohol9 = "Scotch";
    static String alcohol10 = "Cognac";
    static String alcohol11 = "Absinthe";
    static String alcohol12 = "Sake";

    static String[] alcoholNames = {
        alcohol1, alcohol2, alcohol3, alcohol4,
        alcohol5, alcohol6, alcohol7, alcohol8,
        alcohol9, alcohol10, alcohol11, alcohol12
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Bar - Alcohol Names:");
        for (String alcohol : alcoholNames) {
            System.out.println(alcohol);
        }

        System.out.println("main ended");
    }
}
