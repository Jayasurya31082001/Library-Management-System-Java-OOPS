package org.example.User;

import org.example.Book.Book;

public class Librarian extends User{
    private  String employeeNumber;


    public  Librarian(){
        super();
        this.employeeNumber="0";
    }
    public  Librarian(String name,String contactInfo){
        super(name, contactInfo);
        this.employeeNumber="0";
    }
    public  Librarian(Librarian librarian){
        super(librarian);
        this.employeeNumber=librarian.employeeNumber;
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Librarian userId:" +getUserId());
        System.out.println("Librarian employeeID: "+getEmployeeNumber());
        System.out.println("Librarian name: "+getName());
        System.out.println("Librarian contactinfo: "+getContactInfo());
    }

    @Override
    public boolean canBarrowBooks() {
        return true;
    }

    @Override
    public void incrementBookCount() {

    }

    @Override
    public void decrementBookCount() {

    }

    public void addNewBook(Book book){

    }
    public  void removeBook(Book book){

    }


}
