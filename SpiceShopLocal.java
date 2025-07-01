class SpiceShopLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String spice1 = "Turmeric";
        String spice2 = "Coriander";
        String spice3 = "Cumin";
        String spice4 = "Mustard Seeds";
        String spice5 = "Cardamom";
        String spice6 = "Cloves";
        String spice7 = "Cinnamon";
        String spice8 = "Black Pepper";
        String spice9 = "Red Chili Powder";
        String spice10 = "Asafoetida";
        String spice11 = "Fenugreek";
        String spice12 = "Bay Leaf";
        String spice13 = "Carom Seeds";
        String spice14 = "Nutmeg";

        String[] spices = {
            spice1, spice2, spice3, spice4, spice5,
            spice6, spice7, spice8, spice9, spice10,
            spice11, spice12, spice13, spice14
        };

        System.out.println("SpiceShop - Available Spices:");
        for (String spice : spices) {
            System.out.println(spice);
        }

        System.out.println("main ended");
    }
}
