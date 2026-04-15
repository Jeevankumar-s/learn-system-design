package singleresponsibility;

public class ProblematicUser {
    private String name;
    private String phoneNumber;
    private String email;

    ProblematicUser(String name, String phoneNumber, String email){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public String getEmail(){
        return this.email;
    }
    public void sendWelcomeEmail(){
        System.out.println("Sending Welcome Email");
    }
    public void saveUserToDB(){
        System.out.println("Saving User to DB Success");
    }
    public void generateReport(){
        System.out.println("Generating Report");
    }
}
