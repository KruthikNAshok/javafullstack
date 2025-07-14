class ProductRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        String product = "Bluetooth Speaker";
        int quantity = 2;

        Customer.orderProduct(product, quantity);

        System.out.println("main ended");
    }
}