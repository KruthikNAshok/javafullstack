class BangalorePinCodeLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String area1 = "MG Road";
        String area2 = "Chickpet";
        String area3 = "Malleshwaram";
        String area4 = "Basavanagudi";
        String area5 = "Fraser Town";
        String area6 = "Rajajinagar";
        String area7 = "Shivajinagar";
        String area8 = "Ulsoor";
        String area9 = "Vijayanagar";
        String area10 = "Jayanagar";
        String area11 = "Yeshwanthpur";
        String area12 = "Mathikere";
        String area13 = "BTM Layout";

        String[] areaNames = {
            area1, area2, area3, area4, area5,
            area6, area7, area8, area9, area10,
            area11, area12, area13
        };

        String pin1 = "560001";
        String pin2 = "560002";
        String pin3 = "560003";
        String pin4 = "560004";
        String pin5 = "560005";
        String pin6 = "560006";
        String pin7 = "560007";
        String pin8 = "560008";
        String pin9 = "560010";
        String pin10 = "560011";
        String pin11 = "560012";
        String pin12 = "560013";
        String pin13 = "560029";

        String[] pinCodes = {
            pin1, pin2, pin3, pin4, pin5,
            pin6, pin7, pin8, pin9, pin10,
            pin11, pin12, pin13
        };

        System.out.println("Bangalore Areas with Pin Codes:");
        for (int i = 0; i < areaNames.length; i++) {
            System.out.println(areaNames[i] + " - " + pinCodes[i]);
        }

        System.out.println("main ended");
    }
}
