class PeriodicTableLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String element1 = "Hydrogen";
        String element2 = "Helium";
        String element3 = "Lithium";
        String element4 = "Carbon";
        String element5 = "Nitrogen";
        String element6 = "Oxygen";
        String element7 = "Fluorine";
        String element8 = "Neon";
        String element9 = "Sodium";
        String element10 = "Magnesium";
        String element11 = "Aluminium";
        String element12 = "Chlorine";

        String[] elements = {
            element1, element2, element3, element4,
            element5, element6, element7, element8,
            element9, element10, element11, element12
        };

        System.out.println("Periodic Table - Elements:");
        for (String element : elements) {
            System.out.println(element);
        }

        System.out.println("main ended");
    }
}
