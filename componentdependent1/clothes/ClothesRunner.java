class ClothesRunner {

    public static void main(String[] args) {

        boolean clothesAreRegistered = Clothes.registerClothes("Levi's", "Jeans", "M", "Blue", 2999.0, true);

        System.out.println("Are clothes registered: " + clothesAreRegistered);

        if (clothesAreRegistered) {
            Clothes.getClothesInfo();
        }
    }
}
