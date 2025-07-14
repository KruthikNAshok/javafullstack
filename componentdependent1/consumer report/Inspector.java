class Inspector {
    public static void verifyReport(String issue, String location) {
        System.out.println("Inspector is verifying the report");

        Authority.takeAction(issue, location);

        System.out.println("Inspector has verified the report");
    }
}