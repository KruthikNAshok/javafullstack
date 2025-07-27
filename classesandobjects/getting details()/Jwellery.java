class Jwellery {
    int jwelleryId;
    String type;
    String material;
    double weight;
    double price;
    boolean isTraditional;

   public void printDetails() {
        System.out.println("Jwellery ID: " + jwelleryId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Traditional: " + isTraditional);
    }
}
