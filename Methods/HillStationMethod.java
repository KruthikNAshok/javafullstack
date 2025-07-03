class HillStationMethod {

    public static void main(String[] places) {
        visit("Ooty", "Shimla");
        explore("Manali", "Munnar");
        relax("Coorg", "Kodaikanal");
        trek("Darjeeling", "Araku Valley");
    }

    public static void visit(String place1, String place2) {
        System.out.println( place1 +  place2);
    }

    public static void explore(String place1, String place2) {
        System.out.println( place1 + place2);
    }

    public static void relax(String place1, String place2) {
        System.out.println( place1 + place2);
    }

    public static void trek(String place1, String place2) {
        System.out.println( place1 + place2);
    }
}
