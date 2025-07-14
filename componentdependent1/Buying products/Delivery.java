class Delivery {
    public static void assignDelivery(String product, int quantity) {
        System.out.println("Delivery system assigning a delivery boy");

        DeliveryBoy.deliver(product, quantity);

        System.out.println("Delivery process initiated");
    }
}
