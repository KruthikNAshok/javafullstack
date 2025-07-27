class InvitationCardRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        InvitationCard card1 = new InvitationCard();
        card1.cardId = 1;
        card1.eventType = "Wedding";
        card1.recipientName = "John";
        card1.venue = "Sunshine Hall";
        card1.date = "20-Aug-2025";
        card1.isDigital = false;
        card1.printDetails();

        InvitationCard card2 = new InvitationCard();
        card2.cardId = 2;
        card2.eventType = "Birthday";
        card2.recipientName = "Emily";
        card2.venue = "Garden Villa";
        card2.date = "15-Sep-2025";
        card2.isDigital = true;
        card2.printDetails();

        InvitationCard card3 = new InvitationCard();
        card3.cardId = 3;
        card3.eventType = "Anniversary";
        card3.recipientName = "Sarah";
        card3.venue = "Crystal Palace";
        card3.date = "12-Oct-2025";
        card3.isDigital = false;
        card3.printDetails();

        InvitationCard card4 = new InvitationCard();
        card4.cardId = 4;
        card4.eventType = "Housewarming";
        card4.recipientName = "David";
        card4.venue = "Maple Street Home";
        card4.date = "05-Nov-2025";
        card4.isDigital = true;
        card4.printDetails();

        InvitationCard card5 = new InvitationCard();
        card5.cardId = 5;
        card5.eventType = "Baby Shower";
        card5.recipientName = "Nina";
        card5.venue = "Palm Resort";
        card5.date = "10-Dec-2025";
        card5.isDigital = false;
        card5.printDetails();

        InvitationCard card6 = new InvitationCard();
        card6.cardId = 6;
        card6.eventType = "Engagement";
        card6.recipientName = "Alex";
        card6.venue = "Grand Pavilion";
        card6.date = "22-Jan-2026";
        card6.isDigital = true;
        card6.printDetails();

        InvitationCard card7 = new InvitationCard();
        card7.cardId = 7;
        card7.eventType = "Graduation";
        card7.recipientName = "Liam";
        card7.venue = "University Hall";
        card7.date = "05-Feb-2026";
        card7.isDigital = false;
        card7.printDetails();

        InvitationCard card8 = new InvitationCard();
        card8.cardId = 8;
        card8.eventType = "Reception";
        card8.recipientName = "Olivia";
        card8.venue = "Royal Orchid";
        card8.date = "12-Feb-2026";
        card8.isDigital = true;
        card8.printDetails();

        InvitationCard card9 = new InvitationCard();
        card9.cardId = 9;
        card9.eventType = "Baby Naming";
        card9.recipientName = "Ethan";
        card9.venue = "Skyview Club";
        card9.date = "18-Feb-2026";
        card9.isDigital = false;
        card9.printDetails();

        InvitationCard card10 = new InvitationCard();
        card10.cardId = 10;
        card10.eventType = "Retirement";
        card10.recipientName = "Grace";
        card10.venue = "Heritage Club";
        card10.date = "25-Feb-2026";
        card10.isDigital = true;
        card10.printDetails();

        InvitationCard card11 = new InvitationCard();
        card11.cardId = 11;
        card11.eventType = "Inauguration";
        card11.recipientName = "Mia";
        card11.venue = "Phoenix Tower";
        card11.date = "01-Mar-2026";
        card11.isDigital = false;
        card11.printDetails();

        InvitationCard card12 = new InvitationCard();
        card12.cardId = 12;
        card12.eventType = "Religious Ceremony";
        card12.recipientName = "Zara";
        card12.venue = "Holy Grace Temple";
        card12.date = "10-Mar-2026";
        card12.isDigital = true;
        card12.printDetails();

        InvitationCard card13 = new InvitationCard();
        card13.cardId = 13;
        card13.eventType = "Naming Ceremony";
        card13.recipientName = "Noah";
        card13.venue = "Lotus Banquet";
        card13.date = "18-Mar-2026";
        card13.isDigital = false;
        card13.printDetails();

        InvitationCard card14 = new InvitationCard();
        card14.cardId = 14;
        card14.eventType = "Graduation";
        card14.recipientName = "Sophia";
        card14.venue = "New Horizon Auditorium";
        card14.date = "25-Mar-2026";
        card14.isDigital = true;
        card14.printDetails();

        InvitationCard card15 = new InvitationCard();
        card15.cardId = 15;
        card15.eventType = "Farewell";
        card15.recipientName = "Arjun";
        card15.venue = "Sky Lounge";
        card15.date = "30-Mar-2026";
        card15.isDigital = false;
        card15.printDetails();

        InvitationCard card16 = new InvitationCard();
        card16.cardId = 16;
        card16.eventType = "Promotion Party";
        card16.recipientName = "Nikhil";
        card16.venue = "Coral Lounge";
        card16.date = "03-Apr-2026";
        card16.isDigital = true;
        card16.printDetails();

        InvitationCard card17 = new InvitationCard();
        card17.cardId = 17;
        card17.eventType = "Cultural Fest";
        card17.recipientName = "Priya";
        card17.venue = "City Amphitheatre";
        card17.date = "07-Apr-2026";
        card17.isDigital = false;
        card17.printDetails();

        InvitationCard card18 = new InvitationCard();
        card18.cardId = 18;
        card18.eventType = "Corporate Event";
        card18.recipientName = "Raj";
        card18.venue = "Taj Westend";
        card18.date = "12-Apr-2026";
        card18.isDigital = true;
        card18.printDetails();

        InvitationCard card19 = new InvitationCard();
        card19.cardId = 19;
        card19.eventType = "Charity Gala";
        card19.recipientName = "Meera";
        card19.venue = "Crown Plaza";
        card19.date = "18-Apr-2026";
        card19.isDigital = false;
        card19.printDetails();

        InvitationCard card20 = new InvitationCard();
        card20.cardId = 20;
        card20.eventType = "Product Launch";
        card20.recipientName = "Vikram";
        card20.venue = "Tech Convention Center";
        card20.date = "22-Apr-2026";
        card20.isDigital = true;
        card20.printDetails();

        System.out.println("main ended");
    }
}
