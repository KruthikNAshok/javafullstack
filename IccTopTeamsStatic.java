class IccTopTeamsStatic {

    static String team1 = "India";
    static String team2 = "Australia";
    static String team3 = "England";
    static String team4 = "New Zealand";
    static String team5 = "South Africa";
    static String team6 = "Pakistan";
    static String team7 = "Sri Lanka";
    static String team8 = "Bangladesh";
    static String team9 = "Afghanistan";
    static String team10 = "West Indies";

    static String[] iccTopTeams = {
        team1, team2, team3, team4, team5,
        team6, team7, team8, team9, team10
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("ICC Top Teams:");
        for(String team : iccTopTeams) {
            System.out.println(team);
        }

        System.out.println("main ended");
    }
}
