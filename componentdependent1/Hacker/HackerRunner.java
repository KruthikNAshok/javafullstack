class HackerRunner {

    public static void main(String[] args) {

        boolean hackerIsRegistered = Hacker.registerHacker("Elliot Alderson", "Mr. Robot", "USA", 28, "Cybersecurity", true);

        System.out.println("Is hacker registered: " + hackerIsRegistered);

        if (hackerIsRegistered) {
            Hacker.getHackerInfo();
        }
    }
}
