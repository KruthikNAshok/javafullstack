class Courtcase {
    int caseId;
    String caseType;
    String courtName;
    String judgeName;
    String filingDate;
    boolean isClosed; 

   public void printDetails() {
        System.out.println("Case ID: " + caseId);
        System.out.println("Type: " + caseType);
        System.out.println("Court: " + courtName);
        System.out.println("Judge: " + judgeName);
        System.out.println("Filing Date: " + filingDate);
        System.out.println("Closed: " + isClosed);
        
    }
}