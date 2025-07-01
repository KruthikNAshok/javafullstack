class PlayStoreStatic {

    static String app1 = "WhatsApp";
    static String app2 = "Instagram";
    static String app3 = "Facebook";
    static String app4 = "Snapchat";
    static String app5 = "YouTube";
    static String app6 = "Spotify";
    static String app7 = "Netflix";
    static String app8 = "Google Maps";
    static String app9 = "Amazon";
    static String app10 = "Flipkart";

    static String[] appNames = {
        app1, app2, app3, app4, app5,
        app6, app7, app8, app9, app10
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("PlayStore - App List:");
        for (String app : appNames) {
            System.out.println(app);
        }

        System.out.println("main ended");
    }
}
