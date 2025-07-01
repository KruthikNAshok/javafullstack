class SocialMediaStatic {

    static String media1 = "Facebook";
    static String media2 = "Instagram";
    static String media3 = "WhatsApp";
    static String media4 = "Twitter (X)";
    static String media5 = "Snapchat";
    static String media6 = "LinkedIn";
    static String media7 = "Telegram";
    static String media8 = "Reddit";
    static String media9 = "YouTube";
    static String media10 = "Pinterest";

    static String[] mediaNames = {
        media1, media2, media3, media4, media5,
        media6, media7, media8, media9, media10
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Social Media Platforms:");
        for (String media : mediaNames) {
            System.out.println(media);
        }

        System.out.println("main ended");
    }
}
