class JuiceLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String juice1 = "Orange Juice";
        String juice2 = "Apple Juice";
        String juice3 = "Grape Juice";
        String juice4 = "Pineapple Juice";
        String juice5 = "Watermelon Juice";
        String juice6 = "Mango Juice";
        String juice7 = "Pomegranate Juice";
        String juice8 = "Lime Juice";
        String juice9 = "Carrot Juice";
        String juice10 = "Beetroot Juice";
        String juice11 = "Mosambi Juice";
        String juice12 = "Mixed Fruit Juice";
        String juice13 = "Strawberry Juice";
        String juice14 = "Kiwi Juice";
        String juice15 = "Tomato Juice";

        String[] juices = {
            juice1, juice2, juice3, juice4, juice5,
            juice6, juice7, juice8, juice9, juice10,
            juice11, juice12, juice13, juice14, juice15
        };

        System.out.println("Juices Available:");
        for (String juice : juices) {
            System.out.println(juice);
        }

        System.out.println("main ended");
    }
}
