class MarketRunner {

    public static void main(String[] args) {

        boolean marketIsRegistered = Market.registerMarket("KR Market", "Bangalore", 150, true, "Wholesale", "6 AM - 9 PM");

        System.out.println("Is market registered: " + marketIsRegistered);

        if (marketIsRegistered) {
            Market.getMarketInfo();
        }
    }
}
