class StockMarketLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String stock1 = "RELIANCE";
        String stock2 = "TCS";
        String stock3 = "INFY";
        String stock4 = "HDFC Bank";
        String stock5 = "ICICI Bank";
        String stock6 = "Hindustan Unilever";
        String stock7 = "Asian Paints";
        String stock8 = "Maruti Suzuki";
        String stock9 = "State Bank of India";
        String stock10 = "Adani Enterprises";

        String[] stockNames = {
            stock1, stock2, stock3, stock4, stock5,
            stock6, stock7, stock8, stock9, stock10
        };

        System.out.println("StockMarket - Top Stocks:");
        for (String stock : stockNames) {
            System.out.println(stock);
        }

        System.out.println("main ended");
    }
}
