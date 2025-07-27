class Festival {
    String name;
    String region;
    String mainDeityOrEvent;
    int durationDays;
    boolean isPublicHoliday;
    String monthCelebrated;

   public void printDetails() {
        System.out.println("Festival: " + name);
        System.out.println("Region: " + region);
        System.out.println("Main Deity/Event: " + mainDeityOrEvent);
        System.out.println("Duration: " + durationDays + " days");
        System.out.println("Public Holiday: " + isPublicHoliday);
        System.out.println("Month Celebrated: " + monthCelebrated);
       
    }
}