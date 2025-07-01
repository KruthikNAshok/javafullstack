class SocialMediaLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String media1 = "Facebook";
        String media2 = "Instagram";
        String media3 = "WhatsApp";
        String media4 = "Twitter (X)";
        String media5 = "Snapchat";
        String media6 = "LinkedIn";
        String media7 = "Telegram";
        String media8 = "Reddit";
        String media9 = "YouTube";
        String media10 = "Pinterest";

        String[] mediaNames = {
            media1, media2, media3, media4, media5,
            media6, media7, media8, media9, media10
        };

        System.out.println("Social Media Platforms:");
        for (String media : mediaNames) {
            System.out.println(media);
        }

        System.out.println("main ended");
    }
}
