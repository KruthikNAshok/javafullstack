class Consumer {
    public static void reportIssue(String issue, String location) {
        System.out.println("Consumer is reporting an issue");

        ReportCenter.receiveReport(issue, location);

        System.out.println("Consumer has submitted the report");
    }
}