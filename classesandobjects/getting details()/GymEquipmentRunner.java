class GymEquipmentRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        GymEquipment equipment1 = new GymEquipment();
        equipment1.equipmentId = 1;
        equipment1.name = "Treadmill";
        equipment1.type = "Cardio";
        equipment1.price = 45000.0;
        equipment1.weight = 75.5;
        equipment1.isElectronic = true;
        equipment1.printDetails();

        GymEquipment equipment2 = new GymEquipment();
        equipment2.equipmentId = 2;
        equipment2.name = "Dumbbells";
        equipment2.type = "Strength";
        equipment2.price = 1200.0;
        equipment2.weight = 8.0;
        equipment2.isElectronic = false;
        equipment2.printDetails();

        GymEquipment equipment3 = new GymEquipment();
        equipment3.equipmentId = 3;
        equipment3.name = "Exercise Bike";
        equipment3.type = "Cardio";
        equipment3.price = 25000.0;
        equipment3.weight = 40.0;
        equipment3.isElectronic = true;
        equipment3.printDetails();

        GymEquipment equipment4 = new GymEquipment();
        equipment4.equipmentId = 4;
        equipment4.name = "Rowing Machine";
        equipment4.type = "Cardio";
        equipment4.price = 30000.0;
        equipment4.weight = 50.5;
        equipment4.isElectronic = true;
        equipment4.printDetails();

        GymEquipment equipment5 = new GymEquipment();
        equipment5.equipmentId = 5;
        equipment5.name = "Kettlebells";
        equipment5.type = "Strength";
        equipment5.price = 2000.0;
        equipment5.weight = 12.0;
        equipment5.isElectronic = false;
        equipment5.printDetails();

        GymEquipment equipment6 = new GymEquipment();
        equipment6.equipmentId = 6;
        equipment6.name = "Elliptical Trainer";
        equipment6.type = "Cardio";
        equipment6.price = 35000.0;
        equipment6.weight = 65.0;
        equipment6.isElectronic = true;
        equipment6.printDetails();

        GymEquipment equipment7 = new GymEquipment();
        equipment7.equipmentId = 7;
        equipment7.name = "Resistance Bands";
        equipment7.type = "Strength";
        equipment7.price = 800.0;
        equipment7.weight = 0.5;
        equipment7.isElectronic = false;
        equipment7.printDetails();

        GymEquipment equipment8 = new GymEquipment();
        equipment8.equipmentId = 8;
        equipment8.name = "Leg Press Machine";
        equipment8.type = "Strength";
        equipment8.price = 40000.0;
        equipment8.weight = 90.0;
        equipment8.isElectronic = false;
        equipment8.printDetails();

        GymEquipment equipment9 = new GymEquipment();
        equipment9.equipmentId = 9;
        equipment9.name = "Bench Press";
        equipment9.type = "Strength";
        equipment9.price = 22000.0;
        equipment9.weight = 70.0;
        equipment9.isElectronic = false;
        equipment9.printDetails();

        GymEquipment equipment10 = new GymEquipment();
        equipment10.equipmentId = 10;
        equipment10.name = "Stepper";
        equipment10.type = "Cardio";
        equipment10.price = 18000.0;
        equipment10.weight = 35.0;
        equipment10.isElectronic = true;
        equipment10.printDetails();

        GymEquipment equipment11 = new GymEquipment();
        equipment11.equipmentId = 11;
        equipment11.name = "Lat Pulldown";
        equipment11.type = "Strength";
        equipment11.price = 27000.0;
        equipment11.weight = 55.0;
        equipment11.isElectronic = false;
        equipment11.printDetails();

        GymEquipment equipment12 = new GymEquipment();
        equipment12.equipmentId = 12;
        equipment12.name = "Smith Machine";
        equipment12.type = "Strength";
        equipment12.price = 52000.0;
        equipment12.weight = 85.0;
        equipment12.isElectronic = false;
        equipment12.printDetails();

        GymEquipment equipment13 = new GymEquipment();
        equipment13.equipmentId = 13;
        equipment13.name = "Cable Crossover";
        equipment13.type = "Strength";
        equipment13.price = 60000.0;
        equipment13.weight = 95.0;
        equipment13.isElectronic = false;
        equipment13.printDetails();

        GymEquipment equipment14 = new GymEquipment();
        equipment14.equipmentId = 14;
        equipment14.name = "Bosu Ball";
        equipment14.type = "Balance";
        equipment14.price = 3500.0;
        equipment14.weight = 5.0;
        equipment14.isElectronic = false;
        equipment14.printDetails();

        GymEquipment equipment15 = new GymEquipment();
        equipment15.equipmentId = 15;
        equipment15.name = "Ab Roller";
        equipment15.type = "Core";
        equipment15.price = 999.0;
        equipment15.weight = 2.0;
        equipment15.isElectronic = false;
        equipment15.printDetails();

        GymEquipment equipment16 = new GymEquipment();
        equipment16.equipmentId = 16;
        equipment16.name = "Battle Rope";
        equipment16.type = "Strength";
        equipment16.price = 2500.0;
        equipment16.weight = 9.0;
        equipment16.isElectronic = false;
        equipment16.printDetails();

        GymEquipment equipment17 = new GymEquipment();
        equipment17.equipmentId = 17;
        equipment17.name = "Power Rack";
        equipment17.type = "Strength";
        equipment17.price = 47000.0;
        equipment17.weight = 100.0;
        equipment17.isElectronic = false;
        equipment17.printDetails();

        GymEquipment equipment18 = new GymEquipment();
        equipment18.equipmentId = 18;
        equipment18.name = "Foam Roller";
        equipment18.type = "Recovery";
        equipment18.price = 799.0;
        equipment18.weight = 1.0;
        equipment18.isElectronic = false;
        equipment18.printDetails();

        GymEquipment equipment19 = new GymEquipment();
        equipment19.equipmentId = 19;
        equipment19.name = "Vibration Plate";
        equipment19.type = "Recovery";
        equipment19.price = 15000.0;
        equipment19.weight = 25.0;
        equipment19.isElectronic = true;
        equipment19.printDetails();

        GymEquipment equipment20 = new GymEquipment();
        equipment20.equipmentId = 20;
        equipment20.name = "Arm Curl Machine";
        equipment20.type = "Strength";
        equipment20.price = 26000.0;
        equipment20.weight = 60.0;
        equipment20.isElectronic = false;
        equipment20.printDetails();

        System.out.println("main ended");
    }
}
