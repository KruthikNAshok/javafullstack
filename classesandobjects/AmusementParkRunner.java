class AmusementParkRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        AmusementPark park1 = new AmusementPark();
        park1.parkName = "Wonderla";
        park1.location = "Bangalore";
        park1.totalRides = 60;
        park1.entryFee = 1200.0;
        park1.hasWaterPark = true;
        park1.openingHours = "10 AM - 6 PM";
        System.out.println("Park 1: " + park1.parkName + ", " + park1.location + ", " + park1.totalRides + ", " + park1.entryFee + ", " + park1.hasWaterPark + ", " + park1.openingHours);

        AmusementPark park2 = new AmusementPark();
        park2.parkName = "Imagicaa";
        park2.location = "Mumbai";
        park2.totalRides = 70;
        park2.entryFee = 1500.0;
        park2.hasWaterPark = true;
        park2.openingHours = "11 AM - 7 PM";
        System.out.println("Park 2: " + park2.parkName + ", " + park2.location + ", " + park2.totalRides + ", " + park2.entryFee + ", " + park2.hasWaterPark + ", " + park2.openingHours);

        AmusementPark park3 = new AmusementPark();
        park3.parkName = "Essel World";
        park3.location = "Mumbai";
        park3.totalRides = 55;
        park3.entryFee = 900.0;
        park3.hasWaterPark = false;
        park3.openingHours = "10:30 AM - 6:30 PM";
        System.out.println("Park 3: " + park3.parkName + ", " + park3.location + ", " + park3.totalRides + ", " + park3.entryFee + ", " + park3.hasWaterPark + ", " + park3.openingHours);

        AmusementPark park4 = new AmusementPark();
        park4.parkName = "Fun City";
        park4.location = "Chandigarh";
        park4.totalRides = 40;
        park4.entryFee = 800.0;
        park4.hasWaterPark = true;
        park4.openingHours = "10 AM - 5 PM";
        System.out.println("Park 4: " + park4.parkName + ", " + park4.location + ", " + park4.totalRides + ", " + park4.entryFee + ", " + park4.hasWaterPark + ", " + park4.openingHours);

        AmusementPark park5 = new AmusementPark();
        park5.parkName = "Kingdom of Dreams";
        park5.location = "Gurgaon";
        park5.totalRides = 35;
        park5.entryFee = 1100.0;
        park5.hasWaterPark = false;
        park5.openingHours = "12 PM - 9 PM";
        System.out.println("Park 5: " + park5.parkName + ", " + park5.location + ", " + park5.totalRides + ", " + park5.entryFee + ", " + park5.hasWaterPark + ", " + park5.openingHours);

        AmusementPark park6 = new AmusementPark();
        park6.parkName = "Adventure Island";
        park6.location = "Delhi";
        park6.totalRides = 50;
        park6.entryFee = 950.0;
        park6.hasWaterPark = true;
        park6.openingHours = "11 AM - 8 PM";
        System.out.println("Park 6: " + park6.parkName + ", " + park6.location + ", " + park6.totalRides + ", " + park6.entryFee + ", " + park6.hasWaterPark + ", " + park6.openingHours);

        AmusementPark park7 = new AmusementPark();
        park7.parkName = "Nicco Park";
        park7.location = "Kolkata";
        park7.totalRides = 42;
        park7.entryFee = 700.0;
        park7.hasWaterPark = true;
        park7.openingHours = "10:30 AM - 6 PM";
        System.out.println("Park 7: " + park7.parkName + ", " + park7.location + ", " + park7.totalRides + ", " + park7.entryFee + ", " + park7.hasWaterPark + ", " + park7.openingHours);

        AmusementPark park8 = new AmusementPark();
        park8.parkName = "Ramoji Film City";
        park8.location = "Hyderabad";
        park8.totalRides = 45;
        park8.entryFee = 1350.0;
        park8.hasWaterPark = false;
        park8.openingHours = "9 AM - 5:30 PM";
        System.out.println("Park 8: " + park8.parkName + ", " + park8.location + ", " + park8.totalRides + ", " + park8.entryFee + ", " + park8.hasWaterPark + ", " + park8.openingHours);

        AmusementPark park9 = new AmusementPark();
        park9.parkName = "Ocean Park";
        park9.location = "Hyderabad";
        park9.totalRides = 30;
        park9.entryFee = 650.0;
        park9.hasWaterPark = true;
        park9.openingHours = "11 AM - 6 PM";
        System.out.println("Park 9: " + park9.parkName + ", " + park9.location + ", " + park9.totalRides + ", " + park9.entryFee + ", " + park9.hasWaterPark + ", " + park9.openingHours);

        AmusementPark park10 = new AmusementPark();
        park10.parkName = "Wonder World";
        park10.location = "Pune";
        park10.totalRides = 33;
        park10.entryFee = 850.0;
        park10.hasWaterPark = false;
        park10.openingHours = "10 AM - 6 PM";
        System.out.println("Park 10: " + park10.parkName + ", " + park10.location + ", " + park10.totalRides + ", " + park10.entryFee + ", " + park10.hasWaterPark + ", " + park10.openingHours);

        AmusementPark park11 = new AmusementPark();
        park11.parkName = "Fun World";
        park11.location = "Bangalore";
        park11.totalRides = 38;
        park11.entryFee = 750.0;
        park11.hasWaterPark = true;
        park11.openingHours = "10 AM - 6 PM";
        System.out.println("Park 11: " + park11.parkName + ", " + park11.location + ", " + park11.totalRides + ", " + park11.entryFee + ", " + park11.hasWaterPark + ", " + park11.openingHours);

        AmusementPark park12 = new AmusementPark();
        park12.parkName = "Dream Park";
        park12.location = "Ahmedabad";
        park12.totalRides = 36;
        park12.entryFee = 780.0;
        park12.hasWaterPark = true;
        park12.openingHours = "10 AM - 5 PM";
        System.out.println("Park 12: " + park12.parkName + ", " + park12.location + ", " + park12.totalRides + ", " + park12.entryFee + ", " + park12.hasWaterPark + ", " + park12.openingHours);

        AmusementPark park13 = new AmusementPark();
        park13.parkName = "Funtasia Island";
        park13.location = "Patna";
        park13.totalRides = 25;
        park13.entryFee = 600.0;
        park13.hasWaterPark = true;
        park13.openingHours = "10 AM - 6 PM";
        System.out.println("Park 13: " + park13.parkName + ", " + park13.location + ", " + park13.totalRides + ", " + park13.entryFee + ", " + park13.hasWaterPark + ", " + park13.openingHours);

        AmusementPark park14 = new AmusementPark();
        park14.parkName = "Magic Planet";
        park14.location = "Trivandrum";
        park14.totalRides = 20;
        park14.entryFee = 550.0;
        park14.hasWaterPark = false;
        park14.openingHours = "9 AM - 4 PM";
        System.out.println("Park 14: " + park14.parkName + ", " + park14.location + ", " + park14.totalRides + ", " + park14.entryFee + ", " + park14.hasWaterPark + ", " + park14.openingHours);

        AmusementPark park15 = new AmusementPark();
        park15.parkName = "Fantasy Park";
        park15.location = "Palakkad";
        park15.totalRides = 28;
        park15.entryFee = 620.0;
        park15.hasWaterPark = true;
        park15.openingHours = "10 AM - 5 PM";
        System.out.println("Park 15: " + park15.parkName + ", " + park15.location + ", " + park15.totalRides + ", " + park15.entryFee + ", " + park15.hasWaterPark + ", " + park15.openingHours);

        AmusementPark park16 = new AmusementPark();
        park16.parkName = "Snow World";
        park16.location = "Hyderabad";
        park16.totalRides = 18;
        park16.entryFee = 800.0;
        park16.hasWaterPark = false;
        park16.openingHours = "11 AM - 7 PM";
        System.out.println("Park 16: " + park16.parkName + ", " + park16.location + ", " + park16.totalRides + ", " + park16.entryFee + ", " + park16.hasWaterPark + ", " + park16.openingHours);

        AmusementPark park17 = new AmusementPark();
        park17.parkName = "Aquatica";
        park17.location = "Kolkata";
        park17.totalRides = 27;
        park17.entryFee = 900.0;
        park17.hasWaterPark = true;
        park17.openingHours = "10 AM - 6 PM";
        System.out.println("Park 17: " + park17.parkName + ", " + park17.location + ", " + park17.totalRides + ", " + park17.entryFee + ", " + park17.hasWaterPark + ", " + park17.openingHours);

        AmusementPark park18 = new AmusementPark();
        park18.parkName = "Appu Ghar";
        park18.location = "Gurgaon";
        park18.totalRides = 30;
        park18.entryFee = 1000.0;
        park18.hasWaterPark = true;
        park18.openingHours = "11 AM - 6 PM";
        System.out.println("Park 18: " + park18.parkName + ", " + park18.location + ", " + park18.totalRides + ", " + park18.entryFee + ", " + park18.hasWaterPark + ", " + park18.openingHours);

        AmusementPark park19 = new AmusementPark();
        park19.parkName = "Adventure World";
        park19.location = "Bhopal";
        park19.totalRides = 26;
        park19.entryFee = 700.0;
        park19.hasWaterPark = false;
        park19.openingHours = "10 AM - 5 PM";
        System.out.println("Park 19: " + park19.parkName + ", " + park19.location + ", " + park19.totalRides + ", " + park19.entryFee + ", " + park19.hasWaterPark + ", " + park19.openingHours);

        AmusementPark park20 = new AmusementPark();
        park20.parkName = "VGP Universal Kingdom";
        park20.location = "Chennai";
        park20.totalRides = 48;
        park20.entryFee = 950.0;
        park20.hasWaterPark = true;
        park20.openingHours = "9:30 AM - 6:30 PM";
        System.out.println("Park 20: " + park20.parkName + ", " + park20.location + ", " + park20.totalRides + ", " + park20.entryFee + ", " + park20.hasWaterPark + ", " + park20.openingHours);

        System.out.println("main ended");
    }
}
