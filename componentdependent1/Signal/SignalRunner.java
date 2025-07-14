class SignalRunner {

    public static void main(String[] args) {

        boolean signalIsRegistered = Signal.registerSignal("MG Road", "Traffic", 45, true, "Red", "6 AM - 10 PM");

        System.out.println("Is signal registered: " + signalIsRegistered);

        if (signalIsRegistered) {
            Signal.getSignalInfo();
        }
    }
}
