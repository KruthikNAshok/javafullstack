class ScriptWriter {
    public static void writeScript(String movieName, String genre) {
        System.out.println("ScriptWriter is writing script for the movie");

        Producer.fundMovie(movieName, genre);

        System.out.println("ScriptWriter completed the script");
    }
}