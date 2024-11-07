package ie.atu.encapsulation;

public class Main {
 public static void main(String[] args) {
    
    //Create secretMessage object
    SecretMessage secretMessage= new SecretMessage("My secret message");

    // Get the secret message
    secretMessage.displayMessage();

    // Create Temperature object
    Temperature temp = new Temperature(25.0);
        
    // Get Temperature
    System.out.println("Temperature in Celsius: " + temp.getCelsius());
    System.out.println("Temperature in Fahrenheit: " + temp.getFahrenheit());

    // Get Grade object
    Grade grade = new Grade("Adam Devlin", 85, "DM24");

    // Get Grades
    System.out.println("Student Name: " + grade.getStudentName());
    System.out.println("Numeric Grade: " + grade.getNumericGrade());
    System.out.println("Course Code: " + grade.getCourseCode());
    System.out.println("Letter Grade: " + grade.getLetterGrade());

    // Get Book Object
    Book book = new Book("1234567890", "Harry Potter", "Adam Devlin");

    // Get Book Info
    System.out.println("ISBN: " + book.getIsbn());
    System.out.println("Title: " + book.getTitle());
    System.out.println("Author: " + book.getAuthor());

    // Get Account Object
    Account account = new Account(500.00);
    account.deposit(200);
    account.withdraw(100);

    // Account info
    System.out.println("Annual Interest: $" + account.calculateAnnualInterest());
    System.out.println(account.generateStatement());

        // Example to check transaction limit
        account.deposit(50);

        // This will throw an exception since daily transaction limit is reached
        account.deposit(20);

    

}
}

