class SuperMarketStatic {

    static String iceCream1 = "Vanilla";
    static String iceCream2 = "Chocolate";
    static String iceCream3 = "Strawberry";
    static String iceCream4 = "Butterscotch";
    static String iceCream5 = "Mango";
    static String iceCream6 = "Pista";
    static String iceCream7 = "Black Currant";
    static String iceCream8 = "Choco Chip";
    static String iceCream9 = "Kesar";
    static String iceCream10 = "Kulfi";

    static String[] iceCreams = {
        iceCream1, iceCream2, iceCream3, iceCream4, iceCream5,
        iceCream6, iceCream7, iceCream8, iceCream9, iceCream10
    };

    static String perfume1 = "Axe";
    static String perfume2 = "Fogg";
    static String perfume3 = "Denver";
    static String perfume4 = "Park Avenue";
    static String perfume5 = "Wild Stone";
    static String perfume6 = "Skinn";
    static String perfume7 = "Yardley";
    static String perfume8 = "Nautica";
    static String perfume9 = "Guess";
    static String perfume10 = "Dior";

    static String[] perfumes = {
        perfume1, perfume2, perfume3, perfume4, perfume5,
        perfume6, perfume7, perfume8, perfume9, perfume10
    };

    static String grocery1 = "Rice";
    static String grocery2 = "Wheat";
    static String grocery3 = "Dal";
    static String grocery4 = "Sugar";
    static String grocery5 = "Salt";
    static String grocery6 = "Tea";
    static String grocery7 = "Coffee";
    static String grocery8 = "Oil";
    static String grocery9 = "Rava";
    static String grocery10 = "Maida";

    static String[] groceries = {
        grocery1, grocery2, grocery3, grocery4, grocery5,
        grocery6, grocery7, grocery8, grocery9, grocery10
    };

    static String cosmetic1 = "Lipstick";
    static String cosmetic2 = "Foundation";
    static String cosmetic3 = "Compact";
    static String cosmetic4 = "Eyeliner";
    static String cosmetic5 = "Mascara";
    static String cosmetic6 = "Kajal";
    static String cosmetic7 = "Blush";
    static String cosmetic8 = "Nail Polish";
    static String cosmetic9 = "Moisturizer";
    static String cosmetic10 = "Sunscreen";

    static String[] cosmetics = {
        cosmetic1, cosmetic2, cosmetic3, cosmetic4, cosmetic5,
        cosmetic6, cosmetic7, cosmetic8, cosmetic9, cosmetic10
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Ice Creams:");
        for(String item : iceCreams) {
            System.out.println(item);
        }

        System.out.println("Perfumes:");
        for(String item : perfumes) {
            System.out.println(item);
        }

        System.out.println("Groceries:");
        for(String item : groceries) {
            System.out.println(item);
        }

        System.out.println("Cosmetics:");
        for(String item : cosmetics) {
            System.out.println(item);
        }

        System.out.println("main ended");
    }
}
