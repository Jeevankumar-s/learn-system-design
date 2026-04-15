package singleresponsibility;

public class Main {
    public static void main(String[] args){
       /* ProblematicUser user = new ProblematicUser("jeevan", "9597919390",
                "jeevenkumar2003@gmail.com");
        System.out.println(user.getEmail());
        user.saveUserToDB();
        user.generateReport();
        user.sendWelcomeEmail();
        */
        User user = new User("jeevan", "9597919390", "jeevenkumar2003@gmail.com");
        System.out.println(user.getEmail());
        UserRepository userRepository = new UserRepository();
        GenerateReport generateReport = new GenerateReport();
        EmailService emailService = new EmailService();

        userRepository.saveUserToDB(user);
        generateReport.generateReport(user);
        emailService.sendWelcomeEmail(user);



    }
}
