class Radio {

    static String brand;
    static String model;
    static double frequencyRange;
    static int volumeLevel;
    static boolean isOn;
    static String color;

    public static boolean registerRadio(String br, String mo, double freq, int vol, boolean power, String col) {

        boolean isRadioRegistered = false;

        boolean brandValid = false;
        boolean modelValid = false;
        boolean frequencyValid = false;
        boolean volumeValid = false;
        boolean powerValid = false;
        boolean colorValid = false;

        if (br != null) {
            brand = br;
            brandValid = true;
        } else {
            System.out.println("Give valid brand");
        }

        if (mo != null) {
            model = mo;
            modelValid = true;
        } else {
            System.out.println("Give valid model");
        }

        if (freq > 0) {
            frequencyRange = freq;
            frequencyValid = true;
        } else {
            System.out.println("Enter valid frequency range");
        }

        if (vol >= 0 && vol <= 10) {
            volumeLevel = vol;
            volumeValid = true;
        } else {
            System.out.println("Volume must be between 0 and 10");
        }

        // Since boolean can't be null, we always accept it as valid input
        isOn = power;
        powerValid = true;

        if (col != null) {
            color = col;
            colorValid = true;
        } else {
            System.out.println("Enter valid color");
        }

        if (brandValid && modelValid && frequencyValid && volumeValid && powerValid && colorValid) {
            isRadioRegistered = true;
        } else {
            System.out.println("Radio is not registered");
        }

        return isRadioRegistered;
    }

    public static void getRadioInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Frequency Range: " + frequencyRange + " MHz");
        System.out.println("Volume Level: " + volumeLevel);
        System.out.println("Power Status: " + (isOn ? "On" : "Off"));
        System.out.println("Color: " + color);
    }
}
