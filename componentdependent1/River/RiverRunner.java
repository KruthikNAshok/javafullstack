class RiverRunner {

    public static void main(String[] args) {

        boolean riverIsRegistered = River.registerRiver("Ganga", "Gangotri", "Bay of Bengal", 2525.0, true, "India");

        System.out.println("Is river registered: " + riverIsRegistered);

        if (riverIsRegistered) {
            River.getRiverInfo();
        }
    }
}
