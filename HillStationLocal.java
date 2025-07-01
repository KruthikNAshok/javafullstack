class HillStationLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String resort1 = "Coorg Wilderness Resort";
        String resort2 = "Evolve Back, Coorg";
        String resort3 = "The Serai, Chikmagalur";
        String resort4 = "Java Rain Resort, Chikmagalur";
        String resort5 = "Vythiri Village, Madikeri";
        String resort6 = "Club Mahindra, Madikeri";
        String resort7 = "Silver Oaks Resort, Sakleshpur";

        String[] resorts = {
            resort1, resort2, resort3, resort4,
            resort5, resort6, resort7
        };

        System.out.println("Karnataka HillStation Resorts:");
        for (String resort : resorts) {
            System.out.println(resort);
        }

        System.out.println("main ended");
    }
}
