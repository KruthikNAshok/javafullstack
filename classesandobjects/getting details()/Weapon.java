class Weapon {
    int weaponId;
    String name;
    String type;
    String material;
    double weight;
    boolean isLicensed;

   public  void printDetails() {
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Licensed: " + isLicensed);
        
    }
}
