class Coins {
    int coinId;
    String country;
    double value;
    String material;
    int year;
    boolean isRare;

   public void printDetails() {
        System.out.println("Coin ID: " + coinId);
        System.out.println("Country: " + country);
        System.out.println("Value: " + value);
        System.out.println("Material: " + material);
        System.out.println("Year: " + year);
        System.out.println("Is Rare: " + isRare);
    }
}
