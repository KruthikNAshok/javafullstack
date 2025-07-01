class PlayStoreLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String app1 = "WhatsApp";
        String app2 = "Instagram";
        String app3 = "Facebook";
        String app4 = "Snapchat";
        String app5 = "YouTube";
        String app6 = "Spotify";
        String app7 = "Netflix";
        String app8 = "Google Maps";
        String app9 = "Amazon";
        String app10 = "Flipkart";

        String[] appNames = {
            app1, app2, app3, app4, app5,
            app6, app7, app8, app9, app10
        };

        System.out.println("PlayStore - App List:");
        for (String app : appNames) {
            System.out.println(app);
        }

        System.out.println("main ended");
    }
}
