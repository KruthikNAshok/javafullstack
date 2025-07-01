class JuiceStatic {

    static String juice1 = "Orange Juice";
    static String juice2 = "Apple Juice";
    static String juice3 = "Grape Juice";
    static String juice4 = "Pineapple Juice";
    static String juice5 = "Watermelon Juice";
    static String juice6 = "Mango Juice";
    static String juice7 = "Pomegranate Juice";
    static String juice8 = "Lime Juice";
    static String juice9 = "Carrot Juice";
    static String juice10 = "Beetroot Juice";
    static String juice11 = "Mosambi Juice";
    static String juice12 = "Mixed Fruit Juice";
    static String juice13 = "Strawberry Juice";
    static String juice14 = "Kiwi Juice";
    static String juice15 = "Tomato Juice";

    static String[] juices = {
        juice1, juice2, juice3, juice4, juice5,
        juice6, juice7, juice8, juice9, juice10,
        juice11, juice12, juice13, juice14, juice15
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Juices Available:");
        for (String juice : juices) {
            System.out.println(juice);
        }

        System.out.println("main ended");
    }
}
