class HairClip {
    int clipId;
    String color;
    String material;
    double price;
    String clipType;
    boolean isFlexible;

   public void printDetails() {
        System.out.println("Clip ID: " + clipId);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Type: " + clipType);
        System.out.println("Flexible: " + isFlexible);
    }
}
