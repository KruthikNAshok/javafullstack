class iplMethod{

    public static void main(String[] teams) {
        teamInfo("RCB", "MI");
        captainInfo("Virat Kohli", "Rohit Sharma");
        homeGround("Chinnaswamy", "Wankhede");
        topScorer("Faf du Plessis", "Suryakumar Yadav");
    }

    public static void teamInfo(String team1, String team2) {
        System.out.println( team1 +  team2);
    }

    public static void captainInfo(String captain1, String captain2) {
        System.out.println( captain1 + captain2);
    }

    public static void homeGround(String ground1, String ground2) {
        System.out.println(ground1 +  ground2);
    }

    public static void topScorer(String player1, String player2) {
        System.out.println( player1 + player2);
    }
}
