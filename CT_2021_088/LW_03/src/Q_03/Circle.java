package Q_03;

public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to compute area
    public double computeArea() {
        return (Math.PI * radius * radius);
    }

    // Method to compute circumference
    public double computeCircumference() {
        return (2 * Math.PI * radius);
    }
}
