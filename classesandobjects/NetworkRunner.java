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
        System.out.println("ID: " + network1.networkId + ", Provider: " + network1.providerName + ", Type: " + network1.networkType + ", Bandwidth: " + network1.bandwidth + " Mbps, 5G Supported: " + network1.is5GSupported + ", Region: " + network1.region);

        Network network2 = new Network();
        network2.networkId = 2;
        network2.providerName = "Airtel";
        network2.networkType = "5G";
        network2.bandwidth = 150.0;
        network2.is5GSupported = true;
        network2.region = "North India";
        System.out.println("ID: " + network2.networkId + ", Provider: " + network2.providerName + ", Type: " + network2.networkType + ", Bandwidth: " + network2.bandwidth + " Mbps, 5G Supported: " + network2.is5GSupported + ", Region: " + network2.region);

        Network network3 = new Network();
        network3.networkId = 3;
        network3.providerName = "Vi";
        network3.networkType = "4G";
        network3.bandwidth = 80.75;
        network3.is5GSupported = false;
        network3.region = "West India";
        System.out.println("ID: " + network3.networkId + ", Provider: " + network3.providerName + ", Type: " + network3.networkType + ", Bandwidth: " + network3.bandwidth + " Mbps, 5G Supported: " + network3.is5GSupported + ", Region: " + network3.region);

        Network network4 = new Network();
        network4.networkId = 4;
        network4.providerName = "BSNL";
        network4.networkType = "3G";
        network4.bandwidth = 20.2;
        network4.is5GSupported = false;
        network4.region = "East India";
        System.out.println("ID: " + network4.networkId + ", Provider: " + network4.providerName + ", Type: " + network4.networkType + ", Bandwidth: " + network4.bandwidth + " Mbps, 5G Supported: " + network4.is5GSupported + ", Region: " + network4.region);

        Network network5 = new Network();
        network5.networkId = 5;
        network5.providerName = "ACT Fibernet";
        network5.networkType = "Broadband";
        network5.bandwidth = 300.0;
        network5.is5GSupported = false;
        network5.region = "Bangalore";
        System.out.println("ID: " + network5.networkId + ", Provider: " + network5.providerName + ", Type: " + network5.networkType + ", Bandwidth: " + network5.bandwidth + " Mbps, 5G Supported: " + network5.is5GSupported + ", Region: " + network5.region);

        Network network6 = new Network();
        network6.networkId = 6;
        network6.providerName = "Hathway";
        network6.networkType = "Cable";
        network6.bandwidth = 120.0;
        network6.is5GSupported = false;
        network6.region = "Hyderabad";
        System.out.println("ID: " + network6.networkId + ", Provider: " + network6.providerName + ", Type: " + network6.networkType + ", Bandwidth: " + network6.bandwidth + " Mbps, 5G Supported: " + network6.is5GSupported + ", Region: " + network6.region);

        Network network7 = new Network();
        network7.networkId = 7;
        network7.providerName = "Excitel";
        network7.networkType = "Fiber";
        network7.bandwidth = 200.0;
        network7.is5GSupported = false;
        network7.region = "Delhi";
        System.out.println("ID: " + network7.networkId + ", Provider: " + network7.providerName + ", Type: " + network7.networkType + ", Bandwidth: " + network7.bandwidth + " Mbps, 5G Supported: " + network7.is5GSupported + ", Region: " + network7.region);

        Network network8 = new Network();
        network8.networkId = 8;
        network8.providerName = "Tikona";
        network8.networkType = "WiFi";
        network8.bandwidth = 75.0;
        network8.is5GSupported = false;
        network8.region = "Mumbai";
        System.out.println("ID: " + network8.networkId + ", Provider: " + network8.providerName + ", Type: " + network8.networkType + ", Bandwidth: " + network8.bandwidth + " Mbps, 5G Supported: " + network8.is5GSupported + ", Region: " + network8.region);

        Network network9 = new Network();
        network9.networkId = 9;
        network9.providerName = "GTPL";
        network9.networkType = "Broadband";
        network9.bandwidth = 90.0;
        network9.is5GSupported = false;
        network9.region = "Ahmedabad";
        System.out.println("ID: " + network9.networkId + ", Provider: " + network9.providerName + ", Type: " + network9.networkType + ", Bandwidth: " + network9.bandwidth + " Mbps, 5G Supported: " + network9.is5GSupported + ", Region: " + network9.region);

        Network network10 = new Network();
        network10.networkId = 10;
        network10.providerName = "RailWire";
        network10.networkType = "Fiber";
        network10.bandwidth = 180.0;
        network10.is5GSupported = false;
        network10.region = "Chennai";
        System.out.println("ID: " + network10.networkId + ", Provider: " + network10.providerName + ", Type: " + network10.networkType + ", Bandwidth: " + network10.bandwidth + " Mbps, 5G Supported: " + network10.is5GSupported + ", Region: " + network10.region);

        Network network11 = new Network();
        network11.networkId = 11;
        network11.providerName = "You Broadband";
        network11.networkType = "Cable";
        network11.bandwidth = 110.0;
        network11.is5GSupported = false;
        network11.region = "Kochi";
        System.out.println("ID: " + network11.networkId + ", Provider: " + network11.providerName + ", Type: " + network11.networkType + ", Bandwidth: " + network11.bandwidth + " Mbps, 5G Supported: " + network11.is5GSupported + ", Region: " + network11.region);

        Network network12 = new Network();
        network12.networkId = 12;
        network12.providerName = "Tata Play Fiber";
        network12.networkType = "Fiber";
        network12.bandwidth = 250.0;
        network12.is5GSupported = false;
        network12.region = "Pune";
        System.out.println("ID: " + network12.networkId + ", Provider: " + network12.providerName + ", Type: " + network12.networkType + ", Bandwidth: " + network12.bandwidth + " Mbps, 5G Supported: " + network12.is5GSupported + ", Region: " + network12.region);

        Network network13 = new Network();
        network13.networkId = 13;
        network13.providerName = "Spectra";
        network13.networkType = "Fiber";
        network13.bandwidth = 350.0;
        network13.is5GSupported = false;
        network13.region = "Gurgaon";
        System.out.println("ID: " + network13.networkId + ", Provider: " + network13.providerName + ", Type: " + network13.networkType + ", Bandwidth: " + network13.bandwidth + " Mbps, 5G Supported: " + network13.is5GSupported + ", Region: " + network13.region);

        Network network14 = new Network();
        network14.networkId = 14;
        network14.providerName = "Den Broadband";
        network14.networkType = "WiFi";
        network14.bandwidth = 70.0;
        network14.is5GSupported = false;
        network14.region = "Nagpur";
        System.out.println("ID: " + network14.networkId + ", Provider: " + network14.providerName + ", Type: " + network14.networkType + ", Bandwidth: " + network14.bandwidth + " Mbps, 5G Supported: " + network14.is5GSupported + ", Region: " + network14.region);

        Network network15 = new Network();
        network15.networkId = 15;
        network15.providerName = "Syscon Infoway";
        network15.networkType = "Cable";
        network15.bandwidth = 55.0;
        network15.is5GSupported = false;
        network15.region = "Surat";
        System.out.println("ID: " + network15.networkId + ", Provider: " + network15.providerName + ", Type: " + network15.networkType + ", Bandwidth: " + network15.bandwidth + " Mbps, 5G Supported: " + network15.is5GSupported + ", Region: " + network15.region);

        Network network16 = new Network();
        network16.networkId = 16;
        network16.providerName = "Netplus";
        network16.networkType = "Fiber";
        network16.bandwidth = 210.0;
        network16.is5GSupported = false;
        network16.region = "Punjab";
        System.out.println("ID: " + network16.networkId + ", Provider: " + network16.providerName + ", Type: " + network16.networkType + ", Bandwidth: " + network16.bandwidth + " Mbps, 5G Supported: " + network16.is5GSupported + ", Region: " + network16.region);

        Network network17 = new Network();
        network17.networkId = 17;
        network17.providerName = "Asianet";
        network17.networkType = "Broadband";
        network17.bandwidth = 65.0;
        network17.is5GSupported = false;
        network17.region = "Kerala";
        System.out.println("ID: " + network17.networkId + ", Provider: " + network17.providerName + ", Type: " + network17.networkType + ", Bandwidth: " + network17.bandwidth + " Mbps, 5G Supported: " + network17.is5GSupported + ", Region: " + network17.region);

        Network network18 = new Network();
        network18.networkId = 18;
        network18.providerName = "Siti Broadband";
        network18.networkType = "Cable";
        network18.bandwidth = 85.0;
        network18.is5GSupported = false;
        network18.region = "Goa";
        System.out.println("ID: " + network18.networkId + ", Provider: " + network18.providerName + ", Type: " + network18.networkType + ", Bandwidth: " + network18.bandwidth + " Mbps, 5G Supported: " + network18.is5GSupported + ", Region: " + network18.region);

        Network network19 = new Network();
        network19.networkId = 19;
        network19.providerName = "D-Vois";
        network19.networkType = "Fiber";
        network19.bandwidth = 195.0;
        network19.is5GSupported = false;
        network19.region = "Odisha";
        System.out.println("ID: " + network19.networkId + ", Provider: " + network19.providerName + ", Type: " + network19.networkType + ", Bandwidth: " + network19.bandwidth + " Mbps, 5G Supported: " + network19.is5GSupported + ", Region: " + network19.region);

        Network network20 = new Network();
        network20.networkId = 20;
        network20.providerName = "Alliance";
        network20.networkType = "Fiber";
        network20.bandwidth = 220.0;
        network20.is5GSupported = false;
        network20.region = "Kolkata";
        System.out.println("ID: " + network20.networkId + ", Provider: " + network20.providerName + ", Type: " + network20.networkType + ", Bandwidth: " + network20.bandwidth + " Mbps, 5G Supported: " + network20.is5GSupported + ", Region: " + network20.region);

        System.out.println("main ended");
    }
}
