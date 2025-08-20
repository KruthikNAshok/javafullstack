package com.library.central.book_validate;

import com.library.central.book_details.BookDetails;

public class BookValidate {

    BookDetails details;

    public boolean validated(BookDetails details){
        boolean valid = false;

        boolean validId = false;
        boolean validTitle = false;
        boolean validAuthor = false;
        boolean validPublisher = false;
        boolean validPrice = false;
        boolean validCategory = false;
        boolean validAvailable = false;

        if(details.getBookId() > 0){
            validId = true;
        } else {
            System.out.println("Invalid Book Id..!");
        }

        if(details.getBookTitle() != null && !details.getBookTitle().isEmpty()){
            validTitle = true;
        } else {
            System.out.println("Invalid Book Title");
        }

        if(details.getBookAuthor() != null && !details.getBookAuthor().isEmpty()){
            validAuthor = true;
        } else {
            System.out.println("Invalid Book Author");
        }

        if(details.getBookPublisher() != null && !details.getBookPublisher().isEmpty()){
            validPublisher = true;
        } else {
            System.out.println("Invalid Book Publisher");
        }

        if(details.getBookPrice() > 0){
            validPrice = true;
        } else {
            System.out.println("Invalid Book Price");
        }

        if(details.getBookCategory() != null && !details.getBookCategory().isEmpty()){
            validCategory = true;
        } else {
            System.out.println("Invalid Book Category");
        }

        if(details.getBookAvailable()){
            validAvailable = true;
        } else {
            System.out.println("Book Not Available in Library");
        }

        if(validId && validTitle && validAuthor && validPublisher && validPrice && validCategory && validAvailable){
            this.details = details;
            valid = true;
        }

        return valid;
    }

    public void getBookInfo(){
        System.out.println("Book Id : " + details.getBookId());
        System.out.println("Book Title : " + details.getBookTitle());
        System.out.println("Book Author : " + details.getBookAuthor());
        System.out.println("Book Publisher : " + details.getBookPublisher());
        System.out.println("Book Price : " + details.getBookPrice());
        System.out.println("Book Category : " + details.getBookCategory());
        System.out.println("Book Available : " + details.getBookAvailable());
    }
}
