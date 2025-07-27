class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Network network1 = new Network();
        network1.networkId = 1;
        network1.providerName = "Jio";
        network1.networkType = "4G";
        network1.bandwidth = 100.5;
        network1.is5GSupported = true;
        network1.region = "South India";
        network1.printDetails();

        Network network2 = new Network();
        network2.networkId = 2;
        network2.providerName = "Airtel";
        network2.networkType = "5G";
        network2.bandwidth = 150.0;
        network2.is5GSupported = true;
        network2.region = "North India";
        network2.printDetails();

        Network network3 = new Network();
        network3.networkId = 3;
        network3.providerName = "Vi";
        network3.networkType = "4G";
        network3.bandwidth = 80.3;
        network3.is5GSupported = false;
        network3.region = "West India";
        network3.printDetails();

        Network network4 = new Network();
        network4.networkId = 4;
        network4.providerName = "BSNL";
        network4.networkType = "3G";
        network4.bandwidth = 40.0;
        network4.is5GSupported = false;
        network4.region = "East India";
        network4.printDetails();

        Network network5 = new Network();
        network5.networkId = 5;
        network5.providerName = "ACT";
        network5.networkType = "Fiber";
        network5.bandwidth = 300.0;
        network5.is5GSupported = false;
        network5.region = "Hyderabad";
        network5.printDetails();

        Network network6 = new Network();
        network6.networkId = 6;
        network6.providerName = "Hathway";
        network6.networkType = "Broadband";
        network6.bandwidth = 100.0;
        network6.is5GSupported = false;
        network6.region = "Mumbai";
        network6.printDetails();

        Network network7 = new Network();
        network7.networkId = 7;
        network7.providerName = "Spectra";
        network7.networkType = "Fiber";
        network7.bandwidth = 500.0;
        network7.is5GSupported = false;
        network7.region = "Delhi";
        network7.printDetails();

        Network network8 = new Network();
        network8.networkId = 8;
        network8.providerName = "Excitel";
        network8.networkType = "Broadband";
        network8.bandwidth = 200.0;
        network8.is5GSupported = false;
        network8.region = "Bangalore";
        network8.printDetails();

        Network network9 = new Network();
        network9.networkId = 9;
        network9.providerName = "YOU Broadband";
        network9.networkType = "Fiber";
        network9.bandwidth = 150.0;
        network9.is5GSupported = false;
        network9.region = "Ahmedabad";
        network9.printDetails();

        Network network10 = new Network();
        network10.networkId = 10;
        network10.providerName = "GTPL";
        network10.networkType = "Cable";
        network10.bandwidth = 70.0;
        network10.is5GSupported = false;
        network10.region = "Gujarat";
        network10.printDetails();

        Network network11 = new Network();
        network11.networkId = 11;
        network11.providerName = "Tikona";
        network11.networkType = "Wi-Fi";
        network11.bandwidth = 60.0;
        network11.is5GSupported = false;
        network11.region = "Chennai";
        network11.printDetails();

        Network network12 = new Network();
        network12.networkId = 12;
        network12.providerName = "RailWire";
        network12.networkType = "Broadband";
        network12.bandwidth = 90.0;
        network12.is5GSupported = false;
        network12.region = "Kerala";
        network12.printDetails();

        Network network13 = new Network();
        network13.networkId = 13;
        network13.providerName = "Netplus";
        network13.networkType = "Fiber";
        network13.bandwidth = 250.0;
        network13.is5GSupported = false;
        network13.region = "Punjab";
        network13.printDetails();

        Network network14 = new Network();
        network14.networkId = 14;
        network14.providerName = "Alliance";
        network14.networkType = "Broadband";
        network14.bandwidth = 150.0;
        network14.is5GSupported = false;
        network14.region = "Kolkata";
        network14.printDetails();

        Network network15 = new Network();
        network15.networkId = 15;
        network15.providerName = "Asianet";
        network15.networkType = "Cable";
        network15.bandwidth = 85.0;
        network15.is5GSupported = false;
        network15.region = "Kerala";
        network15.printDetails();

        Network network16 = new Network();
        network16.networkId = 16;
        network16.providerName = "Den Networks";
        network16.networkType = "Broadband";
        network16.bandwidth = 60.0;
        network16.is5GSupported = false;
        network16.region = "Delhi NCR";
        network16.printDetails();

        Network network17 = new Network();
        network17.networkId = 17;
        network17.providerName = "Siti Broadband";
        network17.networkType = "Cable";
        network17.bandwidth = 50.0;
        network17.is5GSupported = false;
        network17.region = "Haryana";
        network17.printDetails();

        Network network18 = new Network();
        network18.networkId = 18;
        network18.providerName = "D-Vois";
        network18.networkType = "Broadband";
        network18.bandwidth = 100.0;
        network18.is5GSupported = false;
        network18.region = "Pune";
        network18.printDetails();

        Network network19 = new Network();
        network19.networkId = 19;
        network19.providerName = "Nextra";
        network19.networkType = "Fiber";
        network19.bandwidth = 200.0;
        network19.is5GSupported = false;
        network19.region = "Delhi";
        network19.printDetails();

        Network network20 = new Network();
        network20.networkId = 20;
        network20.providerName = "BSNL AirFiber";
        network20.networkType = "Wireless";
        network20.bandwidth = 75.0;
        network20.is5GSupported = false;
        network20.region = "India";
        network20.printDetails();

        System.out.println("main ended");
    }
}