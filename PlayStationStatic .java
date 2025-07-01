class PlayStationStatic {

    static String game1 = "God of War";
    static String game2 = "Spider-Man";
    static String game3 = "Horizon Zero Dawn";
    static String game4 = "Uncharted 4";
    static String game5 = "The Last of Us";
    static String game6 = "Gran Turismo";
    static String game7 = "Ghost of Tsushima";
    static String game8 = "Ratchet & Clank";
    static String game9 = "Demon's Souls";
    static String game10 = "Bloodborne";

    static String[] games = {
        game1, game2, game3, game4, game5,
        game6, game7, game8, game9, game10
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("PlayStation - Games List:");
        for (String game : games) {
            System.out.println(game);
        }

        System.out.println("main ended");
    }
}
