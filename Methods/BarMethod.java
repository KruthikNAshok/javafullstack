class BarMethod {

    public static void main(String[] args) {
        alcoholicDrinks("Whisky", "Vodka");
        nonAlcoholicDrinks("Mocktail", "Soft Drink");
        cocktails("Mojito", "Bloody Mary");
        beerBrands("Kingfisher", "Budweiser");
    }

    public static void alcoholicDrinks(String drink1, String drink2) {
        System.out.println( drink1 + drink2);
    }

    public static void nonAlcoholicDrinks(String drink1, String drink2) {
        System.out.println( drink1 + drink2);
    }

    public static void cocktails(String drink1, String drink2) {
        System.out.println( drink1 +  drink2);
    }

    public static void beerBrands(String brand1, String brand2) {
        System.out.println(brand1 + brand2);
    }
}
