class StockMarketStatic {

    static String stock1 = "RELIANCE";
    static String stock2 = "TCS";
    static String stock3 = "INFY";
    static String stock4 = "HDFC Bank";
    static String stock5 = "ICICI Bank";
    static String stock6 = "Hindustan Unilever";
    static String stock7 = "Asian Paints";
    static String stock8 = "Maruti Suzuki";
    static String stock9 = "State Bank of India";
    static String stock10 = "Adani Enterprises";

    static String[] stockNames = {
        stock1, stock2, stock3, stock4, stock5,
        stock6, stock7, stock8, stock9, stock10
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("StockMarket - Top Stocks:");
        for (String stock : stockNames) {
            System.out.println(stock);
        }

        System.out.println("main ended");
    }
}
