class Agent {
    public static void processBooking(String buyerName, String propertyType, String location) {
        System.out.println("Agent is processing the property booking");

        Builder.confirmBooking(buyerName, propertyType, location);

        System.out.println("Agent forwarded booking to builder");
    }
}
