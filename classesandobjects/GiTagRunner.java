class GiTagRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        GiTag tag1 = new GiTag();
        tag1.productName = "Mysore Silk";
        tag1.originState = "Karnataka";
        tag1.category = "Textile";
        tag1.yearOfRegistration = 2005;
        tag1.isHandmade = false;
        tag1.tagNumber = "GI-001";

        GiTag tag2 = new GiTag();
        tag2.productName = "Darjeeling Tea";
        tag2.originState = "West Bengal";
        tag2.category = "Agricultural";
        tag2.yearOfRegistration = 2004;
        tag2.isHandmade = false;
        tag2.tagNumber = "GI-002";

        GiTag tag3 = new GiTag();
        tag3.productName = "Kanjeevaram Silk";
        tag3.originState = "Tamil Nadu";
        tag3.category = "Textile";
        tag3.yearOfRegistration = 2005;
        tag3.isHandmade = true;
        tag3.tagNumber = "GI-003";

        GiTag tag4 = new GiTag();
        tag4.productName = "Alphonso Mango";
        tag4.originState = "Maharashtra";
        tag4.category = "Agricultural";
        tag4.yearOfRegistration = 2007;
        tag4.isHandmade = false;
        tag4.tagNumber = "GI-004";

        GiTag tag5 = new GiTag();
        tag5.productName = "Pochampally Ikat";
        tag5.originState = "Telangana";
        tag5.category = "Textile";
        tag5.yearOfRegistration = 2005;
        tag5.isHandmade = true;
        tag5.tagNumber = "GI-005";

        GiTag tag6 = new GiTag();
        tag6.productName = "Nagaland Chilli";
        tag6.originState = "Nagaland";
        tag6.category = "Agricultural";
        tag6.yearOfRegistration = 2008;
        tag6.isHandmade = false;
        tag6.tagNumber = "GI-006";

        GiTag tag7 = new GiTag();
        tag7.productName = "Madhubani Paintings";
        tag7.originState = "Bihar";
        tag7.category = "Art";
        tag7.yearOfRegistration = 2006;
        tag7.isHandmade = true;
        tag7.tagNumber = "GI-007";

        GiTag tag8 = new GiTag();
        tag8.productName = "Kangra Tea";
        tag8.originState = "Himachal Pradesh";
        tag8.category = "Agricultural";
        tag8.yearOfRegistration = 2005;
        tag8.isHandmade = false;
        tag8.tagNumber = "GI-008";

        GiTag tag9 = new GiTag();
        tag9.productName = "Warli Painting";
        tag9.originState = "Maharashtra";
        tag9.category = "Art";
        tag9.yearOfRegistration = 2011;
        tag9.isHandmade = true;
        tag9.tagNumber = "GI-009";

        GiTag tag10 = new GiTag();
        tag10.productName = "Blue Pottery";
        tag10.originState = "Rajasthan";
        tag10.category = "Handicraft";
        tag10.yearOfRegistration = 2006;
        tag10.isHandmade = true;
        tag10.tagNumber = "GI-010";

        GiTag tag11 = new GiTag();
        tag11.productName = "Kullu Shawl";
        tag11.originState = "Himachal Pradesh";
        tag11.category = "Textile";
        tag11.yearOfRegistration = 2006;
        tag11.isHandmade = true;
        tag11.tagNumber = "GI-011";

        GiTag tag12 = new GiTag();
        tag12.productName = "Bikaneri Bhujia";
        tag12.originState = "Rajasthan";
        tag12.category = "Food";
        tag12.yearOfRegistration = 2010;
        tag12.isHandmade = false;
        tag12.tagNumber = "GI-012";

        GiTag tag13 = new GiTag();
        tag13.productName = "Kolhapuri Chappal";
        tag13.originState = "Maharashtra";
        tag13.category = "Handicraft";
        tag13.yearOfRegistration = 2013;
        tag13.isHandmade = true;
        tag13.tagNumber = "GI-013";

        GiTag tag14 = new GiTag();
        tag14.productName = "Banarasi Saree";
        tag14.originState = "Uttar Pradesh";
        tag14.category = "Textile";
        tag14.yearOfRegistration = 2009;
        tag14.isHandmade = true;
        tag14.tagNumber = "GI-014";

        GiTag tag15 = new GiTag();
        tag15.productName = "Tanjore Painting";
        tag15.originState = "Tamil Nadu";
        tag15.category = "Art";
        tag15.yearOfRegistration = 2007;
        tag15.isHandmade = true;
        tag15.tagNumber = "GI-015";

        GiTag tag16 = new GiTag();
        tag16.productName = "Channapatna Toys";
        tag16.originState = "Karnataka";
        tag16.category = "Handicraft";
        tag16.yearOfRegistration = 2006;
        tag16.isHandmade = true;
        tag16.tagNumber = "GI-016";

        GiTag tag17 = new GiTag();
        tag17.productName = "Thanjavur Doll";
        tag17.originState = "Tamil Nadu";
        tag17.category = "Handicraft";
        tag17.yearOfRegistration = 2008;
        tag17.isHandmade = true;
        tag17.tagNumber = "GI-017";

        GiTag tag18 = new GiTag();
        tag18.productName = "Kashmiri Pashmina";
        tag18.originState = "Jammu and Kashmir";
        tag18.category = "Textile";
        tag18.yearOfRegistration = 2008;
        tag18.isHandmade = true;
        tag18.tagNumber = "GI-018";

        GiTag tag19 = new GiTag();
        tag19.productName = "Manipuri Black Rice";
        tag19.originState = "Manipur";
        tag19.category = "Agricultural";
        tag19.yearOfRegistration = 2015;
        tag19.isHandmade = false;
        tag19.tagNumber = "GI-019";

        GiTag tag20 = new GiTag();
        tag20.productName = "Aranmula Mirror";
        tag20.originState = "Kerala";
        tag20.category = "Handicraft";
        tag20.yearOfRegistration = 2005;
        tag20.isHandmade = true;
        tag20.tagNumber = "GI-020";
		System.out.println("Product: " + tag1.productName + ", Origin: " + tag1.originState + ", Category: " + tag1.category + ", Year: " + tag1.yearOfRegistration + ", Handmade: " + tag1.isHandmade + ", Tag No: " + tag1.tagNumber);
System.out.println("Product: " + tag2.productName + ", Origin: " + tag2.originState + ", Category: " + tag2.category + ", Year: " + tag2.yearOfRegistration + ", Handmade: " + tag2.isHandmade + ", Tag No: " + tag2.tagNumber);
System.out.println("Product: " + tag3.productName + ", Origin: " + tag3.originState + ", Category: " + tag3.category + ", Year: " + tag3.yearOfRegistration + ", Handmade: " + tag3.isHandmade + ", Tag No: " + tag3.tagNumber);
System.out.println("Product: " + tag4.productName + ", Origin: " + tag4.originState + ", Category: " + tag4.category + ", Year: " + tag4.yearOfRegistration + ", Handmade: " + tag4.isHandmade + ", Tag No: " + tag4.tagNumber);
System.out.println("Product: " + tag5.productName + ", Origin: " + tag5.originState + ", Category: " + tag5.category + ", Year: " + tag5.yearOfRegistration + ", Handmade: " + tag5.isHandmade + ", Tag No: " + tag5.tagNumber);
System.out.println("Product: " + tag6.productName + ", Origin: " + tag6.originState + ", Category: " + tag6.category + ", Year: " + tag6.yearOfRegistration + ", Handmade: " + tag6.isHandmade + ", Tag No: " + tag6.tagNumber);
System.out.println("Product: " + tag7.productName + ", Origin: " + tag7.originState + ", Category: " + tag7.category + ", Year: " + tag7.yearOfRegistration + ", Handmade: " + tag7.isHandmade + ", Tag No: " + tag7.tagNumber);
System.out.println("Product: " + tag8.productName + ", Origin: " + tag8.originState + ", Category: " + tag8.category + ", Year: " + tag8.yearOfRegistration + ", Handmade: " + tag8.isHandmade + ", Tag No: " + tag8.tagNumber);
System.out.println("Product: " + tag9.productName + ", Origin: " + tag9.originState + ", Category: " + tag9.category + ", Year: " + tag9.yearOfRegistration + ", Handmade: " + tag9.isHandmade + ", Tag No: " + tag9.tagNumber);
System.out.println("Product: " + tag10.productName + ", Origin: " + tag10.originState + ", Category: " + tag10.category + ", Year: " + tag10.yearOfRegistration + ", Handmade: " + tag10.isHandmade + ", Tag No: " + tag10.tagNumber);
System.out.println("Product: " + tag11.productName + ", Origin: " + tag11.originState + ", Category: " + tag11.category + ", Year: " + tag11.yearOfRegistration + ", Handmade: " + tag11.isHandmade + ", Tag No: " + tag11.tagNumber);
System.out.println("Product: " + tag12.productName + ", Origin: " + tag12.originState + ", Category: " + tag12.category + ", Year: " + tag12.yearOfRegistration + ", Handmade: " + tag12.isHandmade + ", Tag No: " + tag12.tagNumber);
System.out.println("Product: " + tag13.productName + ", Origin: " + tag13.originState + ", Category: " + tag13.category + ", Year: " + tag13.yearOfRegistration + ", Handmade: " + tag13.isHandmade + ", Tag No: " + tag13.tagNumber);
System.out.println("Product: " + tag14.productName + ", Origin: " + tag14.originState + ", Category: " + tag14.category + ", Year: " + tag14.yearOfRegistration + ", Handmade: " + tag14.isHandmade + ", Tag No: " + tag14.tagNumber);
System.out.println("Product: " + tag15.productName + ", Origin: " + tag15.originState + ", Category: " + tag15.category + ", Year: " + tag15.yearOfRegistration + ", Handmade: " + tag15.isHandmade + ", Tag No: " + tag15.tagNumber);
System.out.println("Product: " + tag16.productName + ", Origin: " + tag16.originState + ", Category: " + tag16.category + ", Year: " + tag16.yearOfRegistration + ", Handmade: " + tag16.isHandmade + ", Tag No: " + tag16.tagNumber);
System.out.println("Product: " + tag17.productName + ", Origin: " + tag17.originState + ", Category: " + tag17.category + ", Year: " + tag17.yearOfRegistration + ", Handmade: " + tag17.isHandmade + ", Tag No: " + tag17.tagNumber);
System.out.println("Product: " + tag18.productName + ", Origin: " + tag18.originState + ", Category: " + tag18.category + ", Year: " + tag18.yearOfRegistration + ", Handmade: " + tag18.isHandmade + ", Tag No: " + tag18.tagNumber);
System.out.println("Product: " + tag19.productName + ", Origin: " + tag19.originState + ", Category: " + tag19.category + ", Year: " + tag19.yearOfRegistration + ", Handmade: " + tag19.isHandmade + ", Tag No: " + tag19.tagNumber);
System.out.println("Product: " + tag20.productName + ", Origin: " + tag20.originState + ", Category: " + tag20.category + ", Year: " + tag20.yearOfRegistration + ", Handmade: " + tag20.isHandmade + ", Tag No: " + tag20.tagNumber);


        System.out.println("Main ended");
    }
}
