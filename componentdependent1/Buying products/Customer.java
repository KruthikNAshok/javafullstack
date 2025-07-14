class Customer {
    public static void orderProduct(String product, int quantity) {
        System.out.println("Customer is ordering the product");

        Shop.packProduct(product, quantity);

        System.out.println("Customer completed the order");
    }
}