class KarnatakaTourismLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String place1 = "Mysore Palace";
        String place2 = "Taj Mahal";
        String place3 = "Red Fort";
        String place4 = "Charminar";
        String place5 = "Qutub Minar";
        String place6 = "Gateway of India";
        String place7 = "India Gate";
        String place8 = "Golden Temple";
        String place9 = "Hampi";
        String place10 = "Ajanta Caves";
        String place11 = "Elephanta Caves";
        String place12 = "Backwaters of Kerala";
        String place13 = "Ooty";
        String place14 = "Coorg";
        String place15 = "Kodaikanal";

        String[] touristPlaces = {
            place1, place2, place3, place4, place5,
            place6, place7, place8, place9, place10,
            place11, place12, place13, place14, place15
        };

        System.out.println("Tourist Places:");
        for(String place : touristPlaces) {
            System.out.println(place);
        }

        System.out.println("main ended");
    }
}
