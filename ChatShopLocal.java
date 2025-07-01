class ChatShopLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String chat1 = "Pani Puri";
        String chat2 = "Masala Puri";
        String chat3 = "Sev Puri";
        String chat4 = "Bhel Puri";
        String chat5 = "Dahi Puri";
        String chat6 = "Aloo Tikki";
        String chat7 = "Samosa";
        String chat8 = "Kachori";
        String chat9 = "Vada Pav";
        String chat10 = "Pav Bhaji";

        String[] chats = {
            chat1, chat2, chat3, chat4, chat5,
            chat6, chat7, chat8, chat9, chat10
        };

        System.out.println("ChatShop - Junk Food Items:");
        for (String chat : chats) {
            System.out.println(chat);
        }

        System.out.println("main ended");
    }
}
