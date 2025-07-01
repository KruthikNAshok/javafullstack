class PeriodicTableStatic {

    static String element1 = "Hydrogen";
    static String element2 = "Helium";
    static String element3 = "Lithium";
    static String element4 = "Carbon";
    static String element5 = "Nitrogen";
    static String element6 = "Oxygen";
    static String element7 = "Fluorine";
    static String element8 = "Neon";
    static String element9 = "Sodium";
    static String element10 = "Magnesium";
    static String element11 = "Aluminium";
    static String element12 = "Chlorine";

    static String[] elements = {
        element1, element2, element3, element4,
        element5, element6, element7, element8,
        element9, element10, element11, element12
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Periodic Table - Elements:");
        for (String element : elements) {
            System.out.println(element);
        }

        System.out.println("main ended");
    }
}
