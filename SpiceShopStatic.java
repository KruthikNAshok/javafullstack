class SpiceShopStatic {

    static String spice1 = "Turmeric";
    static String spice2 = "Coriander";
    static String spice3 = "Cumin";
    static String spice4 = "Mustard Seeds";
    static String spice5 = "Cardamom";
    static String spice6 = "Cloves";
    static String spice7 = "Cinnamon";
    static String spice8 = "Black Pepper";
    static String spice9 = "Red Chili Powder";
    static String spice10 = "Asafoetida";
    static String spice11 = "Fenugreek";
    static String spice12 = "Bay Leaf";
    static String spice13 = "Carom Seeds";
    static String spice14 = "Nutmeg";

    static String[] spices = {
        spice1, spice2, spice3, spice4, spice5,
        spice6, spice7, spice8, spice9, spice10,
        spice11, spice12, spice13, spice14
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("SpiceShop - Available Spices:");
        for (String spice : spices) {
            System.out.println(spice);
        }

        System.out.println("main ended");
    }
}
