class LibraryStatic {

    static String book1 = "To Kill a Mockingbird";
    static String book2 = "1984";
    static String book3 = "Pride and Prejudice";
    static String book4 = "The Great Gatsby";
    static String book5 = "The Alchemist";
    static String book6 = "Harry Potter and the Sorcerer's Stone";
    static String book7 = "The Hobbit";
    static String book8 = "Wings of Fire";

    static String[] bookNames = {
        book1, book2, book3, book4,
        book5, book6, book7, book8
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Library - Book Names:");
        for (String book : bookNames) {
            System.out.println(book);
        }

        System.out.println("main ended");
    }
}
