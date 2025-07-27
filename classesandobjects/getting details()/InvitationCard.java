class InvitationCard {
    int cardId;
    String eventType;
    String recipientName;
    String venue;
    String date;
    boolean isDigital;

    public void printDetails() {
        System.out.println("Card ID: " + cardId);
        System.out.println("Event Type: " + eventType);
        System.out.println("Recipient: " + recipientName);
        System.out.println("Venue: " + venue);
        System.out.println("Date: " + date);
        System.out.println("Is Digital: " + isDigital);
    }
}
