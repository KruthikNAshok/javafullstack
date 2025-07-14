class DrivingLicense {
    static String applicantName;
    static String licenseType;

    public static boolean applyForLicense(String name, String type) {
        boolean isApplicationSuccessful = false;
        boolean nameValid = false;
        boolean typeValid = false;

        if (name != null) {
            applicantName = name;
            nameValid = true;
        }

        if (type != null) {
            licenseType = type;
            typeValid = true;
        }

        if (nameValid == true && typeValid == true) {
            isApplicationSuccessful = true;
        }

        return isApplicationSuccessful;
    }

    public static void getLicenseInfo() {
        System.out.println("Applicant Name: " + applicantName);
        System.out.println("License Type: " + licenseType);
    }
}
