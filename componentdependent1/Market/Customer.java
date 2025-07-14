class Customer {
    public static void buy(String vege, int quantity) {
        System.out.println("Customer wants to buy vegetables");

        Shop.sell(vege, quantity);

        System.out.println("Customer completed the buying process");
    }
}
