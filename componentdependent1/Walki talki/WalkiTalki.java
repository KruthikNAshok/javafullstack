class WalkiTalki {

    static String brand;
    static String model;
    static double rangeInKm;
    static boolean isRechargeable;
    static int batteryBackupHours;
    static String frequencyBand;

    public static boolean registerWalkiTalki(String br, String mo, double range, boolean rechargeable, int backup, String band) {

        boolean isWalkiTalkiRegistered = false;

        boolean brandValid = false;
        boolean modelValid = false;
        boolean rangeValid = false;
        boolean rechargeableValid = false;
        boolean backupValid = false;
        boolean bandValid = false;

        if (br != null) {
            brand = br;
            brandValid = true;
        } else {
            System.out.println("Enter valid brand");
        }

        if (mo != null) {
            model = mo;
            modelValid = true;
        } else {
            System.out.println("Enter valid model");
        }

        if (range > 0) {
            rangeInKm = range;
            rangeValid = true;
        } else {
            System.out.println("Enter valid range in km");
        }

        isRechargeable = rechargeable;
        rechargeableValid = true;

        if (backup > 0) {
            batteryBackupHours = backup;
            backupValid = true;
        } else {
            System.out.println("Enter valid battery backup hours");
        }

        if (band != null) {
            frequencyBand = band;
            bandValid = true;
        } else {
            System.out.println("Enter valid frequency band");
        }

        if (brandValid && modelValid && rangeValid && rechargeableValid && backupValid && bandValid) {
            isWalkiTalkiRegistered = true;
        } else {
            System.out.println("WalkiTalki is not registered");
        }

        return isWalkiTalkiRegistered;
    }

    public static void getWalkiTalkiInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Range in KM: " + rangeInKm);
        System.out.println("Rechargeable: " + isRechargeable);
        System.out.println("Battery Backup (hours): " + batteryBackupHours);
        System.out.println("Frequency Band: " + frequencyBand);
    }
}
