class CasinoRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Casino casino1 = new Casino();
        casino1.name = "Bellagio";
        casino1.location = "Las Vegas";
        casino1.isOpen24Hours = true;
        casino1.numberOfGames = 100;
        casino1.hasHotel = true;
        casino1.entryFee = 50.0;
        casino1.printDetails();

        Casino casino2 = new Casino();
        casino2.name = "Marina Bay Sands";
        casino2.location = "Singapore";
        casino2.isOpen24Hours = true;
        casino2.numberOfGames = 200;
        casino2.hasHotel = true;
        casino2.entryFee = 100.0;
        casino2.printDetails();

        Casino casino3 = new Casino();
        casino3.name = "Casino de Monte-Carlo";
        casino3.location = "Monaco";
        casino3.isOpen24Hours = false;
        casino3.numberOfGames = 150;
        casino3.hasHotel = true;
        casino3.entryFee = 30.0;
        casino3.printDetails();

        Casino casino4 = new Casino();
        casino4.name = "Resorts World Sentosa";
        casino4.location = "Singapore";
        casino4.isOpen24Hours = true;
        casino4.numberOfGames = 180;
        casino4.hasHotel = true;
        casino4.entryFee = 75.0;
        casino4.printDetails();

        Casino casino5 = new Casino();
        casino5.name = "Foxwoods";
        casino5.location = "Connecticut";
        casino5.isOpen24Hours = true;
        casino5.numberOfGames = 300;
        casino5.hasHotel = true;
        casino5.entryFee = 20.0;
        casino5.printDetails();

        Casino casino6 = new Casino();
        casino6.name = "Mohegan Sun";
        casino6.location = "Connecticut";
        casino6.isOpen24Hours = true;
        casino6.numberOfGames = 250;
        casino6.hasHotel = true;
        casino6.entryFee = 25.0;
        casino6.printDetails();

        Casino casino7 = new Casino();
        casino7.name = "The Venetian";
        casino7.location = "Las Vegas";
        casino7.isOpen24Hours = true;
        casino7.numberOfGames = 220;
        casino7.hasHotel = true;
        casino7.entryFee = 40.0;
        casino7.printDetails();

        Casino casino8 = new Casino();
        casino8.name = "Crown Casino";
        casino8.location = "Melbourne";
        casino8.isOpen24Hours = true;
        casino8.numberOfGames = 170;
        casino8.hasHotel = true;
        casino8.entryFee = 35.0;
        casino8.printDetails();

        Casino casino9 = new Casino();
        casino9.name = "City of Dreams";
        casino9.location = "Macau";
        casino9.isOpen24Hours = true;
        casino9.numberOfGames = 300;
        casino9.hasHotel = true;
        casino9.entryFee = 60.0;
        casino9.printDetails();

        Casino casino10 = new Casino();
        casino10.name = "Wynn Palace";
        casino10.location = "Macau";
        casino10.isOpen24Hours = true;
        casino10.numberOfGames = 280;
        casino10.hasHotel = true;
        casino10.entryFee = 70.0;
        casino10.printDetails();

        Casino casino11 = new Casino();
        casino11.name = "Sun City";
        casino11.location = "South Africa";
        casino11.isOpen24Hours = false;
        casino11.numberOfGames = 120;
        casino11.hasHotel = true;
        casino11.entryFee = 45.0;
        casino11.printDetails();

        Casino casino12 = new Casino();
        casino12.name = "The Mirage";
        casino12.location = "Las Vegas";
        casino12.isOpen24Hours = true;
        casino12.numberOfGames = 160;
        casino12.hasHotel = true;
        casino12.entryFee = 55.0;
        casino12.printDetails();

        Casino casino13 = new Casino();
        casino13.name = "Atlantis Paradise";
        casino13.location = "Bahamas";
        casino13.isOpen24Hours = false;
        casino13.numberOfGames = 190;
        casino13.hasHotel = true;
        casino13.entryFee = 80.0;
        casino13.printDetails();

        Casino casino14 = new Casino();
        casino14.name = "Caesars Palace";
        casino14.location = "Las Vegas";
        casino14.isOpen24Hours = true;
        casino14.numberOfGames = 210;
        casino14.hasHotel = true;
        casino14.entryFee = 60.0;
        casino14.printDetails();

        Casino casino15 = new Casino();
        casino15.name = "MGM Grand";
        casino15.location = "Las Vegas";
        casino15.isOpen24Hours = true;
        casino15.numberOfGames = 230;
        casino15.hasHotel = true;
        casino15.entryFee = 65.0;
        casino15.printDetails();

        Casino casino16 = new Casino();
        casino16.name = "Harrah's";
        casino16.location = "Atlantic City";
        casino16.isOpen24Hours = true;
        casino16.numberOfGames = 190;
        casino16.hasHotel = true;
        casino16.entryFee = 30.0;
        casino16.printDetails();

        Casino casino17 = new Casino();
        casino17.name = "Sands Macao";
        casino17.location = "Macau";
        casino17.isOpen24Hours = true;
        casino17.numberOfGames = 260;
        casino17.hasHotel = true;
        casino17.entryFee = 55.0;
        casino17.printDetails();

        Casino casino18 = new Casino();
        casino18.name = "SkyCity";
        casino18.location = "Auckland";
        casino18.isOpen24Hours = false;
        casino18.numberOfGames = 140;
        casino18.hasHotel = true;
        casino18.entryFee = 25.0;
        casino18.printDetails();

        Casino casino19 = new Casino();
        casino19.name = "Aspers Casino";
        casino19.location = "London";
        casino19.isOpen24Hours = false;
        casino19.numberOfGames = 120;
        casino19.hasHotel = false;
        casino19.entryFee = 20.0;
        casino19.printDetails();

        Casino casino20 = new Casino();
        casino20.name = "Casino Lisboa";
        casino20.location = "Portugal";
        casino20.isOpen24Hours = false;
        casino20.numberOfGames = 150;
        casino20.hasHotel = true;
        casino20.entryFee = 40.0;
        casino20.printDetails();

        System.out.println("Main ended");
    }
}