class King {
    String name;
    String dynasty;
    String kingdom;
    int reignPeriod; // in years
    boolean wasWarrior;
    String knownFor;

   public  void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Dynasty: " + dynasty);
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Reign Period: " + reignPeriod + " years");
        System.out.println("Was Warrior: " + wasWarrior);
        System.out.println("Known For: " + knownFor);
        
    }
}