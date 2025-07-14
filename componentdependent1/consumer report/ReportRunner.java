class ReportRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        String issue = "Overpriced product in supermarket";
        String location = "Town Market";

        Consumer.reportIssue(issue, location);

        System.out.println("main ended");
    }
}