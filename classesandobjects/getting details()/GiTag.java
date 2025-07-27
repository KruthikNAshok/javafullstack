class GiTag {
    String productName;
    String originState;
    String category;
    int yearOfRegistration;
    boolean isHandmade;
    String tagNumber;

  public  void printDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Origin: " + originState);
        System.out.println("Category: " + category);
        System.out.println("Year of Registration: " + yearOfRegistration);
        System.out.println("Handmade: " + isHandmade);
        System.out.println("Tag Number: " + tagNumber);
        
    }
}