class Buyer {
    public static void bookProperty(String buyerName, String propertyType, String location) {
        System.out.println("Buyer is booking a property");

        Agent.processBooking(buyerName, propertyType, location);

        System.out.println("Buyer completed the booking process");
    }
}