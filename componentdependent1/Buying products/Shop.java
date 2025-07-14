class Shop {
    public static void packProduct(String product, int quantity) {
        System.out.println("Shop is packing the product");

        Delivery.assignDelivery(product, quantity);

        System.out.println("Shop finished packing");
    }
}
