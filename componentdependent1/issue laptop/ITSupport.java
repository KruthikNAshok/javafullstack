class ITSupport {
    public static void processRequest(String employeeName, String department, String laptopModel) {
        System.out.println("IT Support received the laptop request");

        Manager.approveRequest(employeeName, department, laptopModel);

        System.out.println("IT Support forwarded the request to Manager");
    }
}