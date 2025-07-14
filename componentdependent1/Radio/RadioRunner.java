class RadioRunner {

    public static void main(String[] args) {

        boolean radioIsRegistered = Radio.registerRadio("Sony", "SRF-S84", 108.0, 7, true, "Black");

        System.out.println("Is radio registered: " + radioIsRegistered);

        if (radioIsRegistered) {
            Radio.getRadioInfo();
        }
    }
}
