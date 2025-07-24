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
        System.out.println("Case 1: " + case1.caseId + ", " + case1.caseType + ", " + case1.courtName + ", " + case1.judgeName + ", " + case1.filingDate + ", Closed: " + case1.isClosed);

        Courtcase case2 = new Courtcase();
        case2.caseId = 2;
        case2.caseType = "Criminal";
        case2.courtName = "Supreme Court";
        case2.judgeName = "Justice Rao";
        case2.filingDate = "2020-07-23";
        case2.isClosed = true;
        System.out.println("Case 2: " + case2.caseId + ", " + case2.caseType + ", " + case2.courtName + ", " + case2.judgeName + ", " + case2.filingDate + ", Closed: " + case2.isClosed);

        Courtcase case3 = new Courtcase();
        case3.caseId = 3;
        case3.caseType = "Family";
        case3.courtName = "Family Court";
        case3.judgeName = "Justice Priya";
        case3.filingDate = "2022-03-15";
        case3.isClosed = false;
        System.out.println("Case 3: " + case3.caseId + ", " + case3.caseType + ", " + case3.courtName + ", " + case3.judgeName + ", " + case3.filingDate + ", Closed: " + case3.isClosed);

        Courtcase case4 = new Courtcase();
        case4.caseId = 4;
        case4.caseType = "Civil";
        case4.courtName = "District Court";
        case4.judgeName = "Justice Sen";
        case4.filingDate = "2019-09-10";
        case4.isClosed = true;
        System.out.println("Case 4: " + case4.caseId + ", " + case4.caseType + ", " + case4.courtName + ", " + case4.judgeName + ", " + case4.filingDate + ", Closed: " + case4.isClosed);

        Courtcase case5 = new Courtcase();
        case5.caseId = 5;
        case5.caseType = "Criminal";
        case5.courtName = "Sessions Court";
        case5.judgeName = "Justice Menon";
        case5.filingDate = "2021-05-18";
        case5.isClosed = false;
        System.out.println("Case 5: " + case5.caseId + ", " + case5.caseType + ", " + case5.courtName + ", " + case5.judgeName + ", " + case5.filingDate + ", Closed: " + case5.isClosed);

        Courtcase case6 = new Courtcase();
        case6.caseId = 6;
        case6.caseType = "Civil";
        case6.courtName = "High Court";
        case6.judgeName = "Justice Reddy";
        case6.filingDate = "2018-12-22";
        case6.isClosed = true;
        System.out.println("Case 6: " + case6.caseId + ", " + case6.caseType + ", " + case6.courtName + ", " + case6.judgeName + ", " + case6.filingDate + ", Closed: " + case6.isClosed);

        Courtcase case7 = new Courtcase();
        case7.caseId = 7;
        case7.caseType = "Labor";
        case7.courtName = "Labor Court";
        case7.judgeName = "Justice Naik";
        case7.filingDate = "2023-01-05";
        case7.isClosed = false;
        System.out.println("Case 7: " + case7.caseId + ", " + case7.caseType + ", " + case7.courtName + ", " + case7.judgeName + ", " + case7.filingDate + ", Closed: " + case7.isClosed);

        Courtcase case8 = new Courtcase();
        case8.caseId = 8;
        case8.caseType = "Consumer";
        case8.courtName = "Consumer Court";
        case8.judgeName = "Justice Patel";
        case8.filingDate = "2020-02-14";
        case8.isClosed = true;
        System.out.println("Case 8: " + case8.caseId + ", " + case8.caseType + ", " + case8.courtName + ", " + case8.judgeName + ", " + case8.filingDate + ", Closed: " + case8.isClosed);

        Courtcase case9 = new Courtcase();
        case9.caseId = 9;
        case9.caseType = "Civil";
        case9.courtName = "District Court";
        case9.judgeName = "Justice Iyer";
        case9.filingDate = "2021-08-30";
        case9.isClosed = false;
        System.out.println("Case 9: " + case9.caseId + ", " + case9.caseType + ", " + case9.courtName + ", " + case9.judgeName + ", " + case9.filingDate + ", Closed: " + case9.isClosed);

        Courtcase case10 = new Courtcase();
        case10.caseId = 10;
        case10.caseType = "Criminal";
        case10.courtName = "Sessions Court";
        case10.judgeName = "Justice Mehta";
        case10.filingDate = "2019-11-01";
        case10.isClosed = true;
        System.out.println("Case 10: " + case10.caseId + ", " + case10.caseType + ", " + case10.courtName + ", " + case10.judgeName + ", " + case10.filingDate + ", Closed: " + case10.isClosed);

        Courtcase case11 = new Courtcase();
        case11.caseId = 11;
        case11.caseType = "Family";
        case11.courtName = "Family Court";
        case11.judgeName = "Justice Rana";
        case11.filingDate = "2022-04-10";
        case11.isClosed = false;
        System.out.println("Case 11: " + case11.caseId + ", " + case11.caseType + ", " + case11.courtName + ", " + case11.judgeName + ", " + case11.filingDate + ", Closed: " + case11.isClosed);

        Courtcase case12 = new Courtcase();
        case12.caseId = 12;
        case12.caseType = "Civil";
        case12.courtName = "High Court";
        case12.judgeName = "Justice Joshi";
        case12.filingDate = "2020-06-28";
        case12.isClosed = true;
        System.out.println("Case 12: " + case12.caseId + ", " + case12.caseType + ", " + case12.courtName + ", " + case12.judgeName + ", " + case12.filingDate + ", Closed: " + case12.isClosed);

        Courtcase case13 = new Courtcase();
        case13.caseId = 13;
        case13.caseType = "Labor";
        case13.courtName = "Labor Court";
        case13.judgeName = "Justice Dixit";
        case13.filingDate = "2023-07-13";
        case13.isClosed = false;
        System.out.println("Case 13: " + case13.caseId + ", " + case13.caseType + ", " + case13.courtName + ", " + case13.judgeName + ", " + case13.filingDate + ", Closed: " + case13.isClosed);

        Courtcase case14 = new Courtcase();
        case14.caseId = 14;
        case14.caseType = "Consumer";
        case14.courtName = "Consumer Court";
        case14.judgeName = "Justice Rao";
        case14.filingDate = "2019-03-07";
        case14.isClosed = true;
        System.out.println("Case 14: " + case14.caseId + ", " + case14.caseType + ", " + case14.courtName + ", " + case14.judgeName + ", " + case14.filingDate + ", Closed: " + case14.isClosed);

        Courtcase case15 = new Courtcase();
        case15.caseId = 15;
        case15.caseType = "Civil";
        case15.courtName = "District Court";
        case15.judgeName = "Justice Kaur";
        case15.filingDate = "2021-09-17";
        case15.isClosed = false;
        System.out.println("Case 15: " + case15.caseId + ", " + case15.caseType + ", " + case15.courtName + ", " + case15.judgeName + ", " + case15.filingDate + ", Closed: " + case15.isClosed);

        Courtcase case16 = new Courtcase();
        case16.caseId = 16;
        case16.caseType = "Criminal";
        case16.courtName = "Supreme Court";
        case16.judgeName = "Justice Gupta";
        case16.filingDate = "2020-10-25";
        case16.isClosed = true;
        System.out.println("Case 16: " + case16.caseId + ", " + case16.caseType + ", " + case16.courtName + ", " + case16.judgeName + ", " + case16.filingDate + ", Closed: " + case16.isClosed);

        Courtcase case17 = new Courtcase();
        case17.caseId = 17;
        case17.caseType = "Family";
        case17.courtName = "Family Court";
        case17.judgeName = "Justice Shetty";
        case17.filingDate = "2022-12-03";
        case17.isClosed = false;
        System.out.println("Case 17: " + case17.caseId + ", " + case17.caseType + ", " + case17.courtName + ", " + case17.judgeName + ", " + case17.filingDate + ", Closed: " + case17.isClosed);

        Courtcase case18 = new Courtcase();
        case18.caseId = 18;
        case18.caseType = "Civil";
        case18.courtName = "High Court";
        case18.judgeName = "Justice Das";
        case18.filingDate = "2020-01-01";
        case18.isClosed = true;
        System.out.println("Case 18: " + case18.caseId + ", " + case18.caseType + ", " + case18.courtName + ", " + case18.judgeName + ", " + case18.filingDate + ", Closed: " + case18.isClosed);

        Courtcase case19 = new Courtcase();
        case19.caseId = 19;
        case19.caseType = "Labor";
        case19.courtName = "Labor Court";
        case19.judgeName = "Justice Mohan";
        case19.filingDate = "2023-06-06";
        case19.isClosed = false;
        System.out.println("Case 19: " + case19.caseId + ", " + case19.caseType + ", " + case19.courtName + ", " + case19.judgeName + ", " + case19.filingDate + ", Closed: " + case19.isClosed);

        Courtcase case20 = new Courtcase();
        case20.caseId = 20;
        case20.caseType = "Consumer";
        case20.courtName = "Consumer Court";
        case20.judgeName = "Justice Sen";
        case20.filingDate = "2019-08-08";
        case20.isClosed = true;
        System.out.println("Case 20: " + case20.caseId + ", " + case20.caseType + ", " + case20.courtName + ", " + case20.judgeName + ", " + case20.filingDate + ", Closed: " + case20.isClosed);

        System.out.println("Main ended");
    }
}
