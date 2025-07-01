class BangalorePinCodeStatic {

    static String area1 = "MG Road";
    static String area2 = "Chickpet";
    static String area3 = "Malleshwaram";
    static String area4 = "Basavanagudi";
    static String area5 = "Fraser Town";
    static String area6 = "Rajajinagar";
    static String area7 = "Shivajinagar";
    static String area8 = "Ulsoor";
    static String area9 = "Vijayanagar";
    static String area10 = "Jayanagar";
    static String area11 = "Yeshwanthpur";
    static String area12 = "Mathikere";
    static String area13 = "BTM Layout";

    static String[] areaNames = {
        area1, area2, area3, area4, area5,
        area6, area7, area8, area9, area10,
        area11, area12, area13
    };

    static String pin1 = "560001";
    static String pin2 = "560002";
    static String pin3 = "560003";
    static String pin4 = "560004";
    static String pin5 = "560005";
    static String pin6 = "560006";
    static String pin7 = "560007";
    static String pin8 = "560008";
    static String pin9 = "560010";
    static String pin10 = "560011";
    static String pin11 = "560012";
    static String pin12 = "560013";
    static String pin13 = "560029";

    static String[] pinCodes = {
        pin1, pin2, pin3, pin4, pin5,
        pin6, pin7, pin8, pin9, pin10,
        pin11, pin12, pin13
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Bangalore Areas with Pin Codes:");
        for (int i = 0; i < areaNames.length; i++) {
            System.out.println(areaNames[i] + " - " + pinCodes[i]);
        }

        System.out.println("main ended");
    }
}
