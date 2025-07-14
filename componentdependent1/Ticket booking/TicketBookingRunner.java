class TicketBookingRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        String movieName = "Inception";
        int tickets = 3;

        Customer.bookTickets(movieName, tickets);

        System.out.println("main ended");
    }
}