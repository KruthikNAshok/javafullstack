class PlayStationLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String game1 = "God of War";
        String game2 = "Spider-Man";
        String game3 = "Horizon Zero Dawn";
        String game4 = "Uncharted 4";
        String game5 = "The Last of Us";
        String game6 = "Gran Turismo";
        String game7 = "Ghost of Tsushima";
        String game8 = "Ratchet & Clank";
        String game9 = "Demon's Souls";
        String game10 = "Bloodborne";

        String[] games = {
            game1, game2, game3, game4, game5,
            game6, game7, game8, game9, game10
        };

        System.out.println("PlayStation - Games List:");
        for (String game : games) {
            System.out.println(game);
        }

        System.out.println("main ended");
    }
}
