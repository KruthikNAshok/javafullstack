class Builder {
    public static void confirmBooking(String buyerName, String propertyType, String location) {
        System.out.println("Builder is confirming the property availability");

        Registrar.registerProperty(buyerName, propertyType, location);

        System.out.println("Builder confirmed the booking");
    }
}