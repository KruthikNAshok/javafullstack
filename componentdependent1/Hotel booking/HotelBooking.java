class HotelBooking {
    static String guestName;
    static String roomType;

    public static boolean bookRoom(String name, String type) {
        boolean isRoomBooked = false;
        boolean nameValid = false;
        boolean typeValid = false;

        if (name != null) {
            guestName = name;
            nameValid = true;
        }

        if (type != null) {
            roomType = type;
            typeValid = true;
        }

        if (nameValid == true && typeValid == true) {
            isRoomBooked = true;
        }

        return isRoomBooked;
    }

    public static void getBookingInfo() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
    }
}


