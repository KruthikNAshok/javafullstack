class Agent {
    public static void arrangeTickets(String movieName, int tickets) {
        System.out.println("Agent arranging tickets with the producer");

        Producer.provideTickets(movieName, tickets);

        System.out.println("Agent finished arranging tickets");
    }
}
