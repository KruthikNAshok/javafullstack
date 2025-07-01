class EarthLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String continent1 = "Asia";
        String continent2 = "Africa";
        String continent3 = "North America";
        String continent4 = "South America";
        String continent5 = "Antarctica";
        String continent6 = "Europe";
        String continent7 = "Australia";

        String[] continents = {
            continent1, continent2, continent3, continent4,
            continent5, continent6, continent7
        };

        System.out.println("Continents of the Earth:");
        for (String continent : continents) {
            System.out.println(continent);
        }

        System.out.println("main ended");
    }
}
