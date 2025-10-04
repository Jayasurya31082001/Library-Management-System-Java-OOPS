package org.example.Book;

import org.example.User.User;

public interface Lendable {
    public void returnBook(User user);
    public boolean lend(User user);
    public  boolean isAvailable();
}
