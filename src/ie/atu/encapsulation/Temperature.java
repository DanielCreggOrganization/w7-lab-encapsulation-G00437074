package ie.atu.encapsulation;

public class Temperature {

    // Private field to store temperature in Celsius
    private double celsius;

    // Constructor to initialize the temperature in Celsius
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter method to get temperature in Celsius
    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit(){
        return(celsius * 9/5) + 32;
    }

    // Setter method to set temperature in Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}

