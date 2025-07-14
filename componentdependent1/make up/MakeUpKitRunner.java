class MakeUpKitRunner {

    public static void main(String[] args) {

        boolean kitIsRegistered = MakeUpKit.registerMakeUpKit("Lakme", 12, true, "Natural Glow", 2499.0, "Zipper Pouch");

        System.out.println("Is makeup kit registered: " + kitIsRegistered);

        if (kitIsRegistered) {
            MakeUpKit.getMakeUpKitInfo();
        }
    }
}
