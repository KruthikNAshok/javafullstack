class ForestSafari {
    String forestName;
    String location;
    int durationInHours;
    boolean isGuidedTour;
    double ticketPrice;
    String vehicleType;

   public void printDetails() {
        System.out.println("Forest Name: " + forestName);
        System.out.println("Location: " + location);
        System.out.println("Duration: " + durationInHours + " hours");
        System.out.println("Guided Tour: " + isGuidedTour);
        System.out.println("Ticket Price: ₹" + ticketPrice);
        System.out.println("Vehicle Type: " + vehicleType);
        
    }
}