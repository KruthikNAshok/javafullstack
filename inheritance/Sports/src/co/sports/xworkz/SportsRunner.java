package co.sports.xworkz;
import co.sports.xworkz.cricket.Cricket;
import co.sports.xworkz.football.Football;

public class SportsRunner {

    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.ID = 1;
        cricket.Name = "Cricket";

        Football football = new Football();
        football.ID = 2;
        football.Name = "Football";

        System.out.println("Cricket ID: " + cricket.ID);
        System.out.println("Cricket Name: " + cricket.Name);
        System.out.println("Football ID: " + football.ID);
        System.out.println("Football Name: " + football.Name);
    }
}
