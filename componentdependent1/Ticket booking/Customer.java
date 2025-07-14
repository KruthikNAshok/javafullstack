class Customer {
    public static void bookTickets(String movieName, int tickets) {
        System.out.println("Customer is booking tickets for the movie");

        Theatre.sellTickets(movieName, tickets);

        System.out.println("Customer completed the ticket booking process");
    }
}