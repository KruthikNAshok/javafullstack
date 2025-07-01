class KarnatakaTourismPlacesStatic {

    static String place1 = "Mysore Palace";
    static String place2 = "Taj Mahal";
    static String place3 = "Red Fort";
    static String place4 = "Charminar";
    static String place5 = "Qutub Minar";
    static String place6 = "Gateway of India";
    static String place7 = "India Gate";
    static String place8 = "Golden Temple";
    static String place9 = "Hampi";
    static String place10 = "Ajanta Caves";
    static String place11 = "Elephanta Caves";
    static String place12 = "Backwaters of Kerala";
    static String place13 = "Ooty";
    static String place14 = "Coorg";
    static String place15 = "Kodaikanal";

    static String[] touristPlaces = {
        place1, place2, place3, place4, place5,
        place6, place7, place8, place9, place10,
        place11, place12, place13, place14, place15
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Tourist Places:");
        for(String place : touristPlaces) {
            System.out.println(place);
        }

        System.out.println("main ended");
    }
}
