package Q_04;

import Q_01.Cat;
import Q_01.Dog;
import Q_01.Pet;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet[] pets = new Pet[100];
        int count = 0;

        while (true) {
            System.out.print("Enter pet name (or 'STOP' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter pet type ('c' for cat, 'd' for dog): ");
            char type = scanner.nextLine().toLowerCase().charAt(0);

            Pet pet;

            if (type == 'c') {
                pet = new Cat();
                System.out.print("Enter coat color: ");
                String color = scanner.nextLine();
                ((Cat) pet).setCoatColor(color);
            } else if (type == 'd') {
                pet = new Dog();
                double weight = -1;
                while (weight <= 0) {
                    System.out.print("Enter weight (positive number): ");
                    String input = scanner.nextLine();
                    try {
                        weight = Double.parseDouble(input);
                        if (weight <= 0) {
                            System.out.println("Weight must be greater than 0.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                }
                ((Dog) pet).setWeight(weight);
            } else {
                System.out.println("Please enter 'c' or 'd' only.");
                continue;
            }

            pet.setName(name);
            pets[count] = pet;
            count++;

            if (count >= pets.length) {
                System.out.println("Cannot add more pets.");
                break;
            }
        }

        System.out.println("\nPet List:");

        System.out.println("\nCats:");
        boolean foundCat = false;
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Cat) {
                Cat cat = (Cat) pets[i];
                System.out.println("Name: " + cat.getName() + " , Type:Cat "+ ", Coat Color: " + cat.getCoatColor());
                foundCat = true;
            }
        }
        if (!foundCat) {
            System.out.println("No cats.");
        }

        System.out.println("\nDogs:");
        boolean foundDog = false;
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Dog) {
                Dog dog = (Dog) pets[i];
                System.out.println("Name: " + dog.getName() + " , Type:Dog " + ", Weight: " + dog.getWeight());
                foundDog = true;
            }
        }
        if (!foundDog) {
            System.out.println("No dogs.");
        }

        scanner.close();
    }
}



