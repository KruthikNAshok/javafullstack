class GamingPcRunner {

    public static void main(String[] args) {

        boolean pcIsRegistered = GamingPc.registerGamingPc("Alienware", "Intel Core i9", 32, "NVIDIA RTX 4090", 349999.99, true);

        System.out.println("Is Gaming PC registered: " + pcIsRegistered);

        if (pcIsRegistered) {
            GamingPc.getGamingPcInfo();
        }
    }
}
