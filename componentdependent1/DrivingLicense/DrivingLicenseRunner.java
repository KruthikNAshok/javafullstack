class DrivingLicenseRunner {
    public static void main(String args[]) {
        boolean applied = DrivingLicense.applyForLicense("Anil Kumar", "Four Wheeler");
        System.out.println("Is license application successful: " + applied);

        DrivingLicense.getLicenseInfo();
    }
}