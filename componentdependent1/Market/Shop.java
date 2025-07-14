class Shop {
    public static void sell(String vege, int quantity) {
        System.out.println("Shop selling vegetables");

        Broker.brokerage(vege, quantity);

        System.out.println("Shop finished the selling process");
    }
}
