class GamingPc {

    static String brand;
    static String processor;
    static int ramInGB;
    static String graphicsCard;
    static double price;
    static boolean hasRGBLighting;

    public static boolean registerGamingPc(String br, String proc, int ram, String gpu, double pr, boolean rgb) {

        boolean isPcRegistered = false;

        boolean brandValid = false;
        boolean processorValid = false;
        boolean ramValid = false;
        boolean gpuValid = false;
        boolean priceValid = false;
        boolean rgbValid = false;

        if (br != null) {
            brand = br;
            brandValid = true;
        } else {
            System.out.println("Enter valid brand");
        }

        if (proc != null) {
            processor = proc;
            processorValid = true;
        } else {
            System.out.println("Enter valid processor");
        }

        if (ram > 0) {
            ramInGB = ram;
            ramValid = true;
        } else {
            System.out.println("Enter valid RAM size");
        }

        if (gpu != null) {
            graphicsCard = gpu;
            gpuValid = true;
        } else {
            System.out.println("Enter valid graphics card");
        }

        if (pr > 0) {
            price = pr;
            priceValid = true;
        } else {
            System.out.println("Enter valid price");
        }

        hasRGBLighting = rgb;
        rgbValid = true;

        if (brandValid && processorValid && ramValid && gpuValid && priceValid && rgbValid) {
            isPcRegistered = true;
        } else {
            System.out.println("Gaming PC is not registered");
        }

        return isPcRegistered;
    }

    public static void getGamingPcInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM (GB): " + ramInGB);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Price: ₹" + price);
        System.out.println("Has RGB Lighting: " + hasRGBLighting);
    }
}
