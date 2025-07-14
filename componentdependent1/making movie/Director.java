class Director {
    public static void startProject(String movieName, String genre) {
        System.out.println("Director is starting the movie project");

        ScriptWriter.writeScript(movieName, genre);

        System.out.println("Director initiated the movie process");
    }
}