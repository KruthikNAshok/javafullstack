class Hacker {

    static String name;
    static String alias;
    static String country;
    static int age;
    static String specialty;
    static boolean isWanted;

    public static boolean registerHacker(String nm, String aka, String ctry, int hackerAge, String skill, boolean wanted) {

        boolean isHackerRegistered = false;

        boolean nameValid = false;
        boolean aliasValid = false;
        boolean countryValid = false;
        boolean ageValid = false;
        boolean specialtyValid = false;
        boolean wantedValid = false;

        if (nm != null) {
            name = nm;
            nameValid = true;
        } else {
            System.out.println("Enter valid name");
        }

        if (aka != null) {
            alias = aka;
            aliasValid = true;
        } else {
            System.out.println("Enter valid alias");
        }

        if (ctry != null) {
            country = ctry;
            countryValid = true;
        } else {
            System.out.println("Enter valid country");
        }

        if (hackerAge > 0) {
            age = hackerAge;
            ageValid = true;
        } else {
            System.out.println("Enter valid age");
        }

        if (skill != null) {
            specialty = skill;
            specialtyValid = true;
        } else {
            System.out.println("Enter valid specialty");
        }

        isWanted = wanted;
        wantedValid = true;

        if (nameValid && aliasValid && countryValid && ageValid && specialtyValid && wantedValid) {
            isHackerRegistered = true;
        } else {
            System.out.println("Hacker is not registered");
        }

        return isHackerRegistered;
    }

    public static void getHackerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Alias: " + alias);
        System.out.println("Country: " + country);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
        System.out.println("Is Wanted: " + isWanted);
    }
}
