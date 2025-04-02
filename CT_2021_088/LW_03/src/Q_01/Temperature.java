package Q_01;

public class Temperature {
    private double celsius;

    // No-Arg Constructor
    public Temperature()
    {
        this.celsius=0.0;
    }

    // Parameterized Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    //Getter method Temperature in Celsius
    public double toCelsius() {
        return celsius;
    }

    // Getter method to convert Celsius to Fahrenheit
    public double toFahrenheit ()
    {
        return(celsius * 9 / 5 + 32 );
    }

    // Setter method to set temperature in Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Setter method to set temperature in Fahrenheit
    public void setFahrenheit (double fahrenheit ) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}
