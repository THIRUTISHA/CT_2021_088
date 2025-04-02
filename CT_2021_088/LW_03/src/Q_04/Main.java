package Q_04;

public class Main {
    public static void main(String[] args) {
        // Creating a Bicycle with default owner
        Bicycle bike1 = new Bicycle();
        System.out.println("Bike 1 Owner: " + bike1.getOwnerName() + ", Phone: " + bike1.getPhoneNo());

        // Creating a Bicycle with a specific owner
        Bicycle bike2 = new Bicycle("John", "1234567890");
        System.out.println("Bike 2 Owner: " + bike2.getOwnerName() + ", Phone: " + bike2.getPhoneNo());

        // Updating owner details for bike1
        bike1.setOwnerName("kumar");
        bike1.setPhoneNo("0770182230");

        System.out.println("After updating Bike 1 details:");
        System.out.println("Bike 1 Owner: " + bike1.getOwnerName() + ", Phone: " + bike1.getPhoneNo());
    }
}


