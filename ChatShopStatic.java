class ChatShopStatic {

    static String chat1 = "Pani Puri";
    static String chat2 = "Masala Puri";
    static String chat3 = "Sev Puri";
    static String chat4 = "Bhel Puri";
    static String chat5 = "Dahi Puri";
    static String chat6 = "Aloo Tikki";
    static String chat7 = "Samosa";
    static String chat8 = "Kachori";
    static String chat9 = "Vada Pav";
    static String chat10 = "Pav Bhaji";

    static String[] chats = {
        chat1, chat2, chat3, chat4, chat5,
        chat6, chat7, chat8, chat9, chat10
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("ChatShop - Junk Food Items:");
        for (String chat : chats) {
            System.out.println(chat);
        }

        System.out.println("main ended");
    }
}
