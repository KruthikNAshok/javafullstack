class HotelLocal {

    public static void main(String[] args) {

        String idly = "Idly";
        String dosa = "Dosa";
        String vada = "Vada";
        String poori = "Poori";
        String upma = "Upma";
        String pongal = "Pongal";
        String chapati = "Chapati";
        String paratha = "Paratha";
        String biryani = "Biryani";
        String friedRice = "Fried Rice";
        String noodles = "Noodles";
        String meals = "Meals";
        String sambarRice = "Sambar Rice";
        String curdRice = "Curd Rice";
        String lemonRice = "Lemon Rice";
        String tomatoRice = "Tomato Rice";
        String puliyogare = "Puliyogare";
        String bisibelebath = "Bisibelebath";
        String neerDosa = "Neer Dosa";
        String setDosa = "Set Dosa";
        String akkiRoti = "Akki Roti";
        String poha = "Poha";
        String sandwich = "Sandwich";
        String pavBhaji = "Pav Bhaji";
        String maggi = "Maggi";

        String menus[] = {
            idly, dosa, vada, poori, upma, pongal, chapati, paratha, biryani, friedRice,
            noodles, meals, sambarRice, curdRice, lemonRice, tomatoRice, puliyogare, bisibelebath,
            neerDosa, setDosa, akkiRoti, poha, sandwich, pavBhaji, maggi
        };

        System.out.println("Hotel menu (Local Declaration):");
        for(String item : menus) {
            System.out.println(item);
        }
    }
}
