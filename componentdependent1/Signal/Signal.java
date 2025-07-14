class Signal {

    static String location;
    static String signalType;
    static int durationInSeconds;
    static boolean isFunctional;
    static String color;
    static String operatingTime;

    public static boolean registerSignal(String loc, String type, int duration, boolean status, String clr, String time) {

        boolean isSignalRegistered = false;

        boolean locationValid = false;
        boolean typeValid = false;
        boolean durationValid = false;
        boolean statusValid = false;
        boolean colorValid = false;
        boolean timeValid = false;

        if (loc != null) {
            location = loc;
            locationValid = true;
        } else {
            System.out.println("Enter valid location");
        }

        if (type != null) {
            signalType = type;
            typeValid = true;
        } else {
            System.out.println("Enter valid signal type");
        }

        if (duration > 0) {
            durationInSeconds = duration;
            durationValid = true;
        } else {
            System.out.println("Enter valid duration in seconds");
        }

        isFunctional = status;
        statusValid = true;

        if (clr != null) {
            color = clr;
            colorValid = true;
        } else {
            System.out.println("Enter valid signal color");
        }

        if (time != null) {
            operatingTime = time;
            timeValid = true;
        } else {
            System.out.println("Enter valid operating time");
        }

        if (locationValid && typeValid && durationValid && statusValid && colorValid && timeValid) {
            isSignalRegistered = true;
        } else {
            System.out.println("Signal is not registered");
        }

        return isSignalRegistered;
    }

    public static void getSignalInfo() {
        System.out.println("Location: " + location);
        System.out.println("Signal Type: " + signalType);
        System.out.println("Duration (in seconds): " + durationInSeconds);
        System.out.println("Is Functional: " + isFunctional);
        System.out.println("Color: " + color);
        System.out.println("Operating Time: " + operatingTime);
    }
}
