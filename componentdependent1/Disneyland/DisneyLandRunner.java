class DisneyLandRunner {

    public static void main(String[] args) {

        boolean registered = DisneyLand.registerDisneyLand("Anaheim", "USA", 55, true, 7999.0, "9 AM - 10 PM");

        System.out.println("Is DisneyLand registered: " + registered);

        if (registered) {
            DisneyLand.getDisneyLandInfo();
        }
    }
}
