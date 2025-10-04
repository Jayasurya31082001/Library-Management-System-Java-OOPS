package org.example.User;

public class Member extends User{
    private int  barrowBooksCount;
    private final int MAX_BARROW_LIMIT=5;

    public  Member(){
        super();
        this.barrowBooksCount=0;
    }
    public  Member(String name,String contactInfo){
        super(name,contactInfo);
        this.barrowBooksCount=0;
    }
    public  Member(Member member){
        super(member);
        this.barrowBooksCount=member.barrowBooksCount;
    }
    public int getMAX_BARROW_LIMIT() {
        return MAX_BARROW_LIMIT;
    }

    public int getBarrowBooksCount() {
        return barrowBooksCount;
    }



    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Member userID: "+getUserId());
        System.out.println("Member name: "+getName());
        System.out.println("Member contactInfo: "+getContactInfo());
        System.out.println("Books Barrowed: "+barrowBooksCount);
    }

    @Override
    public boolean canBarrowBooks() {
        return (barrowBooksCount<MAX_BARROW_LIMIT) ? true:false;
    }

    @Override
    public void incrementBookCount() {
        barrowBooksCount++;
    }

    @Override
    public void decrementBookCount() {
        barrowBooksCount--;
    }


}
