class CourtcaseRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Courtcase case1 = new Courtcase();
        case1.caseId = 1;
        case1.caseType = "Civil";
        case1.courtName = "High Court";
        case1.judgeName = "Justice Kumar";
        case1.filingDate = "2021-01-12";
        case1.isClosed = false;
        case1.printDetails();

        Courtcase case2 = new Courtcase();
        case2.caseId = 2;
        case2.caseType = "Criminal";
        case2.courtName = "Supreme Court";
        case2.judgeName = "Justice Rao";
        case2.filingDate = "2020-07-23";
        case2.isClosed = true;
        case2.printDetails();

        Courtcase case3 = new Courtcase();
        case3.caseId = 3;
        case3.caseType = "Family";
        case3.courtName = "Family Court";
        case3.judgeName = "Justice Priya";
        case3.filingDate = "2022-03-15";
        case3.isClosed = false;
        case3.printDetails();

        Courtcase case4 = new Courtcase();
        case4.caseId = 4;
        case4.caseType = "Civil";
        case4.courtName = "District Court";
        case4.judgeName = "Justice Sen";
        case4.filingDate = "2019-09-10";
        case4.isClosed = true;
        case4.printDetails();

        Courtcase case5 = new Courtcase();
        case5.caseId = 5;
        case5.caseType = "Criminal";
        case5.courtName = "Sessions Court";
        case5.judgeName = "Justice Menon";
        case5.filingDate = "2021-05-18";
        case5.isClosed = false;
        case5.printDetails();

        Courtcase case6 = new Courtcase();
        case6.caseId = 6;
        case6.caseType = "Civil";
        case6.courtName = "High Court";
        case6.judgeName = "Justice Reddy";
        case6.filingDate = "2018-12-22";
        case6.isClosed = true;
        case6.printDetails();

        Courtcase case7 = new Courtcase();
        case7.caseId = 7;
        case7.caseType = "Labor";
        case7.courtName = "Labor Court";
        case7.judgeName = "Justice Naik";
        case7.filingDate = "2023-01-05";
        case7.isClosed = false;
        case7.printDetails();

        Courtcase case8 = new Courtcase();
        case8.caseId = 8;
        case8.caseType = "Consumer";
        case8.courtName = "Consumer Court";
        case8.judgeName = "Justice Patel";
        case8.filingDate = "2020-02-14";
        case8.isClosed = true;
        case8.printDetails();

        Courtcase case9 = new Courtcase();
        case9.caseId = 9;
        case9.caseType = "Civil";
        case9.courtName = "District Court";
        case9.judgeName = "Justice Iyer";
        case9.filingDate = "2021-08-30";
        case9.isClosed = false;
        case9.printDetails();

        Courtcase case10 = new Courtcase();
        case10.caseId = 10;
        case10.caseType = "Criminal";
        case10.courtName = "Sessions Court";
        case10.judgeName = "Justice Mehta";
        case10.filingDate = "2019-11-01";
        case10.isClosed = true;
        case10.printDetails();

        Courtcase case11 = new Courtcase();
        case11.caseId = 11;
        case11.caseType = "Family";
        case11.courtName = "Family Court";
        case11.judgeName = "Justice Rana";
        case11.filingDate = "2022-04-10";
        case11.isClosed = false;
        case11.printDetails();

        Courtcase case12 = new Courtcase();
        case12.caseId = 12;
        case12.caseType = "Civil";
        case12.courtName = "High Court";
        case12.judgeName = "Justice Joshi";
        case12.filingDate = "2020-06-28";
        case12.isClosed = true;
        case12.printDetails();

        Courtcase case13 = new Courtcase();
        case13.caseId = 13;
        case13.caseType = "Labor";
        case13.courtName = "Labor Court";
        case13.judgeName = "Justice Dixit";
        case13.filingDate = "2023-07-13";
        case13.isClosed = false;
        case13.printDetails();

        Courtcase case14 = new Courtcase();
        case14.caseId = 14;
        case14.caseType = "Consumer";
        case14.courtName = "Consumer Court";
        case14.judgeName = "Justice Rao";
        case14.filingDate = "2019-03-07";
        case14.isClosed = true;
        case14.printDetails();

        Courtcase case15 = new Courtcase();
        case15.caseId = 15;
        case15.caseType = "Civil";
        case15.courtName = "District Court";
        case15.judgeName = "Justice Kaur";
        case15.filingDate = "2021-09-17";
        case15.isClosed = false;
        case15.printDetails();

        Courtcase case16 = new Courtcase();
        case16.caseId = 16;
        case16.caseType = "Criminal";
        case16.courtName = "Supreme Court";
        case16.judgeName = "Justice Gupta";
        case16.filingDate = "2020-10-25";
        case16.isClosed = true;
        case16.printDetails();

        Courtcase case17 = new Courtcase();
        case17.caseId = 17;
        case17.caseType = "Family";
        case17.courtName = "Family Court";
        case17.judgeName = "Justice Shetty";
        case17.filingDate = "2022-12-03";
        case17.isClosed = false;
        case17.printDetails();

        Courtcase case18 = new Courtcase();
        case18.caseId = 18;
        case18.caseType = "Civil";
        case18.courtName = "High Court";
        case18.judgeName = "Justice Das";
        case18.filingDate = "2020-01-01";
        case18.isClosed = true;
        case18.printDetails();

        Courtcase case19 = new Courtcase();
        case19.caseId = 19;
        case19.caseType = "Labor";
        case19.courtName = "Labor Court";
        case19.judgeName = "Justice Mohan";
        case19.filingDate = "2023-06-06";
        case19.isClosed = false;
        case19.printDetails();

        Courtcase case20 = new Courtcase();
        case20.caseId = 20;
        case20.caseType = "Consumer";
        case20.courtName = "Consumer Court";
        case20.judgeName = "Justice Sen";
        case20.filingDate = "2019-08-08";
        case20.isClosed = true;
        case20.printDetails();

        System.out.println("Main ended");
    }
}