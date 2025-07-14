class ReportCenter {
    public static void receiveReport(String issue, String location) {
        System.out.println("Report Center received the complaint");

        Inspector.verifyReport(issue, location);

        System.out.println("Report Center has forwarded the report");
    }
}