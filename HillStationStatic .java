class HillStationStatic {

    static String resort1 = "Coorg Wilderness Resort";
    static String resort2 = "Evolve Back, Coorg";
    static String resort3 = "The Serai, Chikmagalur";
    static String resort4 = "Java Rain Resort, Chikmagalur";
    static String resort5 = "Vythiri Village, Madikeri";
    static String resort6 = "Club Mahindra, Madikeri";
    static String resort7 = "Silver Oaks Resort, Sakleshpur";

    static String[] resorts = {
        resort1, resort2, resort3, resort4,
        resort5, resort6, resort7
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Karnataka HillStation Resorts:");
        for (String resort : resorts) {
            System.out.println(resort);
        }

        System.out.println("main ended");
    }
}
