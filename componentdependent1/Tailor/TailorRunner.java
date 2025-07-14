class TailorRunner {

    public static void main(String[] args) {

        boolean tailorIsRegistered = Tailor.registerTailor("Ramesh", "Perfect Fit Tailors", "Malleswaram", 12, true, "Wedding Suits");

        System.out.println("Is tailor registered: " + tailorIsRegistered);

        if (tailorIsRegistered) {
            Tailor.getTailorInfo();
        }
    }
}
