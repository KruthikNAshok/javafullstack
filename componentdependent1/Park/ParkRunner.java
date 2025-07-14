class ParkRunner {

    public static void main(String[] args) {

        boolean parkIsRegistered = Park.registerPark("Cubbon Park", "Bangalore", 300.5, true, 120, "5 AM - 9 PM");

        System.out.println("Is park registered: " + parkIsRegistered);

        if (parkIsRegistered) {
            Park.getParkInfo();
        }
    }
}
