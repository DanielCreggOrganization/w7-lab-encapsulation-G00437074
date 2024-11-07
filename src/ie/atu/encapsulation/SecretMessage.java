package ie.atu.encapsulation;

public class SecretMessage {
    private String message;

// Constructor
public SecretMessage(String message){
    this.message = message;
}

// Disply the Secret Message
public void displayMessage(){
    System.out.println("Secret Message: " + message);
}

}