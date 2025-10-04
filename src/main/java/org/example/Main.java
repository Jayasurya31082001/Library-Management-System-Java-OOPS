package org.example;

import org.example.Book.Book;
import org.example.Book.NovelBook;
import org.example.Book.TextBook;
import org.example.Library.LibraryManagementSystem;
import org.example.User.Librarian;
import org.example.User.Member;
import org.example.User.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Book naruto = new NovelBook("book1","Naruto","Jayasurya","1");
        Book naruto1 = new NovelBook("book2","Naruto","Jayasurya","2");

        LibraryManagementSystem lms = new LibraryManagementSystem();
      lms.addBook(naruto);
      lms.addBook(naruto1);
        Book C = new TextBook("Book7","C","Suns","Programming",1);
        Book C11 = new TextBook("Book8","C++","Suns","Programming",1);

        Book Java = new TextBook("Book3","Java","Suns","Programming",1);
      Book python = new TextBook("Book4","python","phy","Programming",1);
      Book java25 =  new TextBook("Book6","Java-25","Suns","Programming",25);
      lms.addBook(java25);
      lms.addBook(Java);
      lms.addBook(python);

      User u1 = new Librarian("Jayasurya","abcd");
      User u2 = new Member("Hari","1234");
      User u3 = new Member("Anu","122345");
      User u4 = new Member("Rithin","123445");
      lms.registerUser(u1);
        lms.registerUser(u2);
        lms.registerUser(u3);
        lms.registerUser(u4);

        java25.lend(u2);
        java25.lend(u3);
        Java.lend(u2);
        java25.returnBook(u2);
        java25.lend(u2);
        naruto1.lend(u2);
        naruto.lend(u2);
        C.lend(u2);
        C11.lend(u2);
        python.lend(u2);
        lms.displayUsers();


    }
}