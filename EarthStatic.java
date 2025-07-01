class EarthStatic {

    static String continent1 = "Asia";
    static String continent2 = "Africa";
    static String continent3 = "North America";
    static String continent4 = "South America";
    static String continent5 = "Antarctica";
    static String continent6 = "Europe";
    static String continent7 = "Australia";

    static String[] continents = {
        continent1, continent2, continent3, continent4,
        continent5, continent6, continent7
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Continents of the Earth:");
        for (String continent : continents) {
            System.out.println(continent);
        }

        System.out.println("main ended");
    }
}
