package com.library.central;

import com.library.central.book_admitted.BookAdmitted;
import com.library.central.book_details.BookDetails;

public class LibraryRunner {
    public static void main(String[] args) {

        BookDetails book = new BookDetails();

        book.setBookId(201);
        book.setBookTitle("Java Programming");
        book.setBookAuthor("James Gosling");
        book.setBookPublisher("Sun Microsystems");
        book.setBookPrice(599.50);
        book.setBookAvailable(true);
        book.setBookCategory("Programming");

        BookAdmitted admitted = new BookAdmitted();
        boolean v = admitted.isAdmitted(book);
        if (v) {
            System.out.println("Book Added to Library Successfully ....!");
        }
    }
}
