class Theatre {
    public static void sellTickets(String movieName, int tickets) {
        System.out.println("Theatre selling tickets");

        Agent.arrangeTickets(movieName, tickets);

        System.out.println("Theatre completed the ticket sale");
    }
}