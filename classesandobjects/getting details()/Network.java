class Network {
    int networkId;
    String providerName;
    String networkType;
    double bandwidth;
    boolean is5GSupported;
    String region;

   public void printDetails() {
        System.out.println("Network ID: " + networkId);
        System.out.println("Provider Name: " + providerName);
        System.out.println("Network Type: " + networkType);
        System.out.println("Bandwidth: " + bandwidth + " Mbps");
        System.out.println("5G Supported: " + is5GSupported);
        System.out.println("Region: " + region);
	}
}