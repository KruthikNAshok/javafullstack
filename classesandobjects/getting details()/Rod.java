class Rod {
    int rodId;
    String material;
    double lengthInMeters;
    double weightInKg;
    String usageType;
    boolean isHollow;

   public void printDetails() {
        System.out.println("Rod ID: " + rodId);
        System.out.println("Material: " + material);
        System.out.println("Length: " + lengthInMeters);
        System.out.println("Weight: " + weightInKg);
        System.out.println("Usage: " + usageType);
        System.out.println("Is Hollow: " + isHollow);
        
    }
}
