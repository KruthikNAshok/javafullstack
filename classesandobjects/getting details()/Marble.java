class Marble {
    String color;
    String material;
    double diameter;
    boolean isTransparent;
    String originCountry;
    double price;

   public void printDetails() {
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Transparent: " + isTransparent);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Price: $" + price);
        System.out.println("--------------------------------------");
    }
}