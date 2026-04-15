package singleresponsibility;

public class User {
    private String name;
    private String phoneNumber;
    private String email;

    User(String name, String phoneNumber, String email){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public String getEmail(){
        return this.email;
    }
}
