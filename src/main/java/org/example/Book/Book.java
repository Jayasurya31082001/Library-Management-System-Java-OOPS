package org.example.Book;

import org.example.User.User;

public abstract class Book implements Lendable{
    private  String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public  Book(){
        this.isAvailable=true;
    }
    public  Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    public  Book(Book book){
        this.isbn=book.isbn;
        this.title=book.title;
        this.author=book.author;
        this.isAvailable=book.isAvailable;
    }
    public abstract void displayBookDetails();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public void returnBook(User user) {
        user.decrementBookCount();
        this.isAvailable=true;
    }

    @Override
    public boolean lend(User user) {
        if(this.isAvailable && user.canBarrowBooks()){
            user.incrementBookCount();
            this.isAvailable=false;
        return true;}
        else if(!this.isAvailable){
            System.out.println("OOPS '"+this.title+"' book is currently  not available...");
        }
        else{
            System.out.println("OOPS '"+user.getName()+"' reached limit...");
        }
        return  false;
    }

    @Override
    public boolean isAvailable() {
        return this.isAvailable;
    }
}

