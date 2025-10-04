package org.example.User;

public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;
    private  static  int totalUsers=0;
private  int userSeq=0;
    public static int getTotalUsers() {
        return totalUsers;
    }

    public User(){
        this.userId= generateUniqueId();
    }
    public User(String name,String contactInfo){
        this.name=name;
        this.contactInfo=contactInfo;
        this.userId=generateUniqueId();
    }
    public  User(User user){
       this.name= user.name;
       this.contactInfo=user.contactInfo;
       this.userId= user.userId;

    }


    public abstract void displayDashboard();
    public abstract boolean canBarrowBooks();

     private final String generateUniqueId(){
         totalUsers++;
        return "U-"+userSeq++;
    }


    public String getUserId() {
        return userId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

   public  abstract void incrementBookCount();
     public abstract void decrementBookCount();
}
