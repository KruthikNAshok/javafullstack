class TyreRunner {

    public static void main(String[] args) {

        boolean tyreIsRegistered = Tyre.registerTyre("MRF", "Radial", 16, true, 4999.99, "Car");

        System.out.println("Is Tyre registered: " + tyreIsRegistered);

        if (tyreIsRegistered) {
            Tyre.getTyreInfo();
        }
    }
}
