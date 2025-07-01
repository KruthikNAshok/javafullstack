class SuperMarketLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String iceCream1 = "Vanilla";
        String iceCream2 = "Chocolate";
        String iceCream3 = "Strawberry";
        String iceCream4 = "Butterscotch";
        String iceCream5 = "Mango";
        String iceCream6 = "Pista";
        String iceCream7 = "Black Currant";
        String iceCream8 = "Choco Chip";
        String iceCream9 = "Kesar";
        String iceCream10 = "Kulfi";

        String[] iceCreams = {
            iceCream1, iceCream2, iceCream3, iceCream4, iceCream5,
            iceCream6, iceCream7, iceCream8, iceCream9, iceCream10
        };

        String perfume1 = "Axe";
        String perfume2 = "Fogg";
        String perfume3 = "Denver";
        String perfume4 = "Park Avenue";
        String perfume5 = "Wild Stone";
        String perfume6 = "Skinn";
        String perfume7 = "Yardley";
        String perfume8 = "Nautica";
        String perfume9 = "Guess";
        String perfume10 = "Dior";

        String[] perfumes = {
            perfume1, perfume2, perfume3, perfume4, perfume5,
            perfume6, perfume7, perfume8, perfume9, perfume10
        };

        String grocery1 = "Rice";
        String grocery2 = "Wheat";
        String grocery3 = "Dal";
        String grocery4 = "Sugar";
        String grocery5 = "Salt";
        String grocery6 = "Tea";
        String grocery7 = "Coffee";
        String grocery8 = "Oil";
        String grocery9 = "Rava";
        String grocery10 = "Maida";

        String[] groceries = {
            grocery1, grocery2, grocery3, grocery4, grocery5,
            grocery6, grocery7, grocery8, grocery9, grocery10
        };

        String cosmetic1 = "Lipstick";
        String cosmetic2 = "Foundation";
        String cosmetic3 = "Compact";
        String cosmetic4 = "Eyeliner";
        String cosmetic5 = "Mascara";
        String cosmetic6 = "Kajal";
        String cosmetic7 = "Blush";
        String cosmetic8 = "Nail Polish";
        String cosmetic9 = "Moisturizer";
        String cosmetic10 = "Sunscreen";

        String[] cosmetics = {
            cosmetic1, cosmetic2, cosmetic3, cosmetic4, cosmetic5,
            cosmetic6, cosmetic7, cosmetic8, cosmetic9, cosmetic10
        };

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
