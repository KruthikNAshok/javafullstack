class IccTopTeamsLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String team1 = "India";
        String team2 = "Australia";
        String team3 = "England";
        String team4 = "New Zealand";
        String team5 = "South Africa";
        String team6 = "Pakistan";
        String team7 = "Sri Lanka";
        String team8 = "Bangladesh";
        String team9 = "Afghanistan";
        String team10 = "West Indies";

        String[] iccTopTeams = {
            team1, team2, team3, team4, team5,
            team6, team7, team8, team9, team10
        };

        System.out.println("ICC Top Teams:");
        for(String team : iccTopTeams) {
            System.out.println(team);
        }

        System.out.println("main ended");
    }
}
