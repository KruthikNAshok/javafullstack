class LaptopIssueRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        String employeeName = "Aarav";
        String department = "Development";
        String laptopModel = "Dell Latitude 7430";

        Employee.requestLaptop(employeeName, department, laptopModel);

        System.out.println("main ended");
    }
}