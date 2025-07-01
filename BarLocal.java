class BarLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String alcohol1 = "Whiskey";
        String alcohol2 = "Vodka";
        String alcohol3 = "Rum";
        String alcohol4 = "Gin";
        String alcohol5 = "Tequila";
        String alcohol6 = "Brandy";
        String alcohol7 = "Wine";
        String alcohol8 = "Beer";
        String alcohol9 = "Scotch";
        String alcohol10 = "Cognac";
        String alcohol11 = "Absinthe";
        String alcohol12 = "Sake";

        String[] alcoholNames = {
            alcohol1, alcohol2, alcohol3, alcohol4,
            alcohol5, alcohol6, alcohol7, alcohol8,
            alcohol9, alcohol10, alcohol11, alcohol12
        };

        System.out.println("Bar - Alcohol Names:");
        for (String alcohol : alcoholNames) {
            System.out.println(alcohol);
        }

        System.out.println("main ended");
    }
}
