class GymEquipment {
    int equipmentId;
    String name;
    String type;
    double price;
    double weight;
    boolean isElectronic;

    public void printDetails() {
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Electronic: " + isElectronic);
    }
}
