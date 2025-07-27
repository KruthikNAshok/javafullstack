class Casino {
    String name;
    String location;
    boolean isOpen24Hours;
    int numberOfGames;
    boolean hasHotel;
    double entryFee;

   public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Open 24 Hours: " + isOpen24Hours);
        System.out.println("Number of Games: " + numberOfGames);
        System.out.println("Has Hotel: " + hasHotel);
        System.out.println("Entry Fee: $" + entryFee);
       
    }
}