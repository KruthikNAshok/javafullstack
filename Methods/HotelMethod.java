class HotelMethod{

    public static void main(String[] args) {
        orderBreakfast("Idli", "Dosa");
        orderLunch("Meals", "Biryani");
        orderSnacks("Samosa", "Puff");
        orderDinner("Chapati", "Paneer Curry");
    }

    public static void orderBreakfast(String item1, String item2) {
        System.out.println( item1 +  item2);
    }

    public static void orderLunch(String item1, String item2) {
        System.out.println( item1 + item2);
    }

    public static void orderSnacks(String item1, String item2) {
        System.out.println( item1 +  item2);
    }

    public static void orderDinner(String item1, String item2) {
        System.out.println( item1 + item2);
    }
}
