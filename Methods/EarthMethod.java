class EarthMethod {

    public static void main(String[] args) {
        continents("Asia", "Africa");
        oceans("Pacific", "Atlantic");
        rivers("Ganga", "Amazon");
        mountains("Himalayas", "Andes");
    }

    public static void continents(String continent1, String continent2) {
        System.out.println( continent1 + continent2);
    }

    public static void oceans(String ocean1, String ocean2) {
        System.out.println( ocean1  + ocean2);
    }

    public static void rivers(String river1, String river2) {
        System.out.println( river1 + river2);
    }

    public static void mountains(String mountain1, String mountain2) {
        System.out.println( mountain1 + mountain2);
    }
}
