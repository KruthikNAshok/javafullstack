class Producer {
    public static void fundMovie(String movieName, String genre) {
        System.out.println("Producer is funding the movie");

        Crew.shootMovie(movieName, genre);

        System.out.println("Producer completed funding");
    }
}