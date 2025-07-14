class Manager {
    public static void approveRequest(String employeeName, String department, String laptopModel) {
        System.out.println("Manager is reviewing the laptop request");

        Admin.issueLaptop(employeeName, department, laptopModel);

        System.out.println("Manager approved the request");
    }
}