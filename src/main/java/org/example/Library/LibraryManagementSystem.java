package org.example.Library;

import org.example.Book.Book;
import org.example.Book.NovelBook;
import org.example.Book.TextBook;
import org.example.User.User;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private static List<Book> bookInventory;
    private static List<User> registeredUsers ;

    public  LibraryManagementSystem(){
        bookInventory=new ArrayList<>();
        registeredUsers=new ArrayList<>();
    }

    public void addBook(Book book){
        bookInventory.add(book);
    }
    public  void registerUser(User user){
        registeredUsers.add(user);
    }

    public  List<Book> searchBook(String criteria){
        List<Book> result = new ArrayList<>();
        for (Book book: bookInventory){
            String title = book.getTitle();
            String author = book.getAuthor();
            if(title!=null && title.equals(criteria)){
                result.add(book);
            }
            else if(author!=null && author.equals(criteria)){
                result.add(book);
            }
        }
        return  result;
    }
    public  List<Book> searchBook(String criteria,String type){
        List<Book> result = new ArrayList<>();
        for (Book book: bookInventory){
            String title = book.getTitle();
            String author = book.getAuthor();
            boolean flag = false;
            if((book instanceof NovelBook && type.equalsIgnoreCase("NovelBook"))||
                    (book instanceof TextBook && type.equalsIgnoreCase("TextBook"))){
                 flag=true;
            }
            if(flag){
                if(title!=null && title.equals(criteria)){
                    result.add(book);
                }
                else if(author!=null && author.equals(criteria)){
                    result.add(book);
                }
            }
        }
        return  result;
    }
  public  void displayAllBooks(){
      System.out.println( "Books availble in the inventory:");
        for (Book book : bookInventory){
           System.out.println(book.getTitle());
        }
  }
  public  void displayUsers(){
        System.out.println("Users registerd in this library is:");
        for (User user : registeredUsers){
            System.out.println("User: "+user.getName()+", as "+user.getClass().getSimpleName());
        }
  }
}
