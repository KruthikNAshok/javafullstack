class HotelStatic {

    static String idly = "Idly";
    static String dosa = "Dosa";
    static String vada = "Vada";
    static String poori = "Poori";
    static String upma = "Upma";
    static String pongal = "Pongal";
    static String chapati = "Chapati";
    static String paratha = "Paratha";
    static String biryani = "Biryani";
    static String friedRice = "Fried Rice";
    static String noodles = "Noodles";
    static String meals = "Meals";
    static String sambarRice = "Sambar Rice";
    static String curdRice = "Curd Rice";
    static String lemonRice = "Lemon Rice";
    static String tomatoRice = "Tomato Rice";
    static String puliyogare = "Puliyogare";
    static String bisibelebath = "Bisibelebath";
    static String neerDosa = "Neer Dosa";
    static String setDosa = "Set Dosa";
    static String akkiRoti = "Akki Roti";
    static String poha = "Poha";
    static String sandwich = "Sandwich";
    static String pavBhaji = "Pav Bhaji";
    static String maggi = "Maggi";

    static String menus[] = {
        idly, dosa, vada, poori, upma, pongal, chapati, paratha, biryani, friedRice,
        noodles, meals, sambarRice, curdRice, lemonRice, tomatoRice, puliyogare, bisibelebath,
        neerDosa, setDosa, akkiRoti, poha, sandwich, pavBhaji, maggi
    };

    public static void main(String[] args) {
        System.out.println("Hotel menu (Static Declaration):");
        for(String item : menus) {
            System.out.println(item);
        }
    }
}
