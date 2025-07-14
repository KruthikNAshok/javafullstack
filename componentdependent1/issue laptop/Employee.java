class Employee {
    public static void requestLaptop(String employeeName, String department, String laptopModel) {
        System.out.println("Employee is requesting a laptop");

        ITSupport.processRequest(employeeName, department, laptopModel);

        System.out.println("Employee request submitted");
    }
}