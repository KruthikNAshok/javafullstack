class LibraryLocal {

    public static void main(String[] args) {
        System.out.println("main started");

        String book1 = "To Kill a Mockingbird";
        String book2 = "1984";
        String book3 = "Pride and Prejudice";
        String book4 = "The Great Gatsby";
        String book5 = "The Alchemist";
        String book6 = "Harry Potter and the Sorcerer's Stone";
        String book7 = "The Hobbit";
        String book8 = "Wings of Fire";

        String[] bookNames = {
            book1, book2, book3, book4,
            book5, book6, book7, book8
        };

        System.out.println("Library - Book Names:");
        for (String book : bookNames) {
            System.out.println(book);
        }

        System.out.println("main ended");
    }
}
