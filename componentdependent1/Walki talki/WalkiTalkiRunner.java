class WalkiTalkiRunner {

    public static void main(String[] args) {

        boolean deviceIsRegistered = WalkiTalki.registerWalkiTalki("Motorola", "T800", 35.0, true, 18, "UHF");

        System.out.println("Is WalkiTalki registered: " + deviceIsRegistered);

        if (deviceIsRegistered) {
            WalkiTalki.getWalkiTalkiInfo();
        }
    }
}
