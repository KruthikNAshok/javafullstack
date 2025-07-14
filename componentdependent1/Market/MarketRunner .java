class MarketRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        String vege = "Tomato";
        int quantity = 10;

        Customer.buy(vege, quantity);

        System.out.println("main ended");
    }
}