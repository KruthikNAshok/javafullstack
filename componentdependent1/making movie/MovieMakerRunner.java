class MovieMakerRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        String movieName = "KGF";
        String genre = "Mass";

        Director.startProject(movieName, genre);

        System.out.println("main ended");
    }
}
