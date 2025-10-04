package org.example.Book;

public class TextBook extends  Book{
    private  String subject;
    private  int edition;
    public  TextBook(String isbn,String title,String author,String subject,int edition){
        super(isbn,title,author);
        this.subject=subject;
        this.edition=edition;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Book details: ");
        System.out.println("Book isbn: "+getIsbn());
        System.out.println("Book title: "+getTitle());
        System.out.println("Book author: "+getAuthor());
        System.out.println("Book availablity: "+isAvailable());
        System.out.println("Book subject: "+getSubject());
        System.out.println("Book edtion: "+getEdition());
    }
}
