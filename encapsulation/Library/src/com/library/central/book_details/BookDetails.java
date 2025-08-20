package com.library.central.book_details;

public class BookDetails {

    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;
    private double bookPrice;
    private String bookCategory;
    private boolean bookAvailable;

    public void setBookId(int id){
        this.bookId = id;
    }
    public int getBookId(){
        return bookId;
    }

    public void setBookTitle(String title){
        this.bookTitle = title;
    }
    public String getBookTitle(){
        return bookTitle;
    }

    public void setBookAuthor(String author){
        this.bookAuthor = author;
    }
    public String getBookAuthor(){
        return bookAuthor;
    }

    public void setBookPublisher(String publisher){
        this.bookPublisher = publisher;
    }
    public String getBookPublisher(){
        return bookPublisher;
    }

    public void setBookPrice(double price){
        this.bookPrice = price;
    }
    public double getBookPrice(){
        return bookPrice;
    }

    public void setBookCategory(String category){
        this.bookCategory = category;
    }
    public String getBookCategory(){
        return bookCategory;
    }

    public void setBookAvailable(boolean available){
        this.bookAvailable = available;
    }
    public boolean getBookAvailable(){
        return bookAvailable;
    }
}
