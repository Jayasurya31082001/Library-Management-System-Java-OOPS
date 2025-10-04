package org.example.Book;

public class NovelBook extends Book{

    private  String genere;

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
    public NovelBook(){

    }
    public NovelBook(String isbn,String title,String author,String genere){
        super(isbn, title, author);
        this.genere=genere;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("Book details: ");
        System.out.println("Book isbn: "+getIsbn());
        System.out.println("Book title: "+getTitle());
        System.out.println("Book author: "+getAuthor());
        System.out.println("Book availablity: "+isAvailable());
        System.out.println("Book genere: "+getGenere());
    }
}
