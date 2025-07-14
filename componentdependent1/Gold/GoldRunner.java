class GoldRunner {

    public static void main(String[] args) {

        boolean goldIsRegistered = Gold.registerGold("22K", 15.5, "Necklace", "HM123456", 5850.0, true);

        System.out.println("Is gold registered: " + goldIsRegistered);

        if (goldIsRegistered) {
            Gold.getGoldInfo();
        }
    }
}
