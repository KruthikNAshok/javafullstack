class Fish {
    String name;
    String type;
    double weight;
    double length;
    boolean isFreshWater;
    String originCountry;

   public  void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Length: " + length + " cm");
        System.out.println("Freshwater: " + isFreshWater);
        System.out.println("Origin Country: " + originCountry);
        
    }
}