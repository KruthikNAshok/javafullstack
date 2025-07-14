class PropertyBookingRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        String buyerName = "Kruthik";
        String propertyType = "3BHK Apartment";
        String location = "Whitefield, Bangalore";

        Buyer.bookProperty(buyerName, propertyType, location);

        System.out.println("main ended");
    }
}