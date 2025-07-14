class HotelBookingRunner {
    public static void main(String args[]) {
        boolean booked = HotelBooking.bookRoom("Megha Sharma", "Deluxe");
        System.out.println("Is room booked: " + booked);

        HotelBooking.getBookingInfo();
    }
}