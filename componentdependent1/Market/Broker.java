class Broker {
    public static void brokerage(String vege, int quantity) {
        System.out.println("Broker arranging deal between shop and farmer");

        Farmer.farm(vege, quantity);

        System.out.println("Broker finished the deal");
    }
}
