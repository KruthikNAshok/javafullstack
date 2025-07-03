class LibraryMethod {

    public static void main(String[] args) {
        fictionBooks("The Alchemist", "To Kill a Mockingbird");
        scienceBooks("A Brief History of Time", "The Selfish Gene");
        historyBooks("Sapiens", "Guns, Germs, and Steel");
        technologyBooks("Clean Code", "Introduction to Algorithms");
    }

    public static void fictionBooks(String book1, String book2) {
        System.out.println( book1+ book2);
    }

    public static void scienceBooks(String book1, String book2) {
        System.out.println(  book1 +  book2);
    }

    public static void historyBooks(String book1, String book2) {
        System.out.println( book1 + book2);
    }

    public static void technologyBooks(String book1, String book2) {
        System.out.println( book1  + book2);
    }
}
