package Q_03;

import Q_01.Cat;
import Q_01.Dog;
import Q_01.Pet;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet[] pets = new Pet[100]; // Array to hold up to 100 pets
        int count = 0;

        while (true) {
            System.out.print("Enter pet name (or 'STOP' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter pet type ('c' for cat, 'd' for dog): ");
            char type = scanner.nextLine().charAt(0);

            Pet pet;
            if (type == 'c') {
                pet = new Cat();
            } else if (type == 'd') {
                pet = new Dog();
            } else {
                System.out.println("Invalid type. Please enter 'c' for cat or 'd' for dog.");
                continue; // Skip to the next iteration
            }

            pet.setName(name);
            pets[count] = pet;
            count++;

            // Check if the array is full
            if (count >= pets.length) {
                System.out.println("The pet array is full. No more pets can be added.");
                break;
            }
        }

        // Output the list of pets after input is complete
        System.out.println("\nList of pets:\n");

        // Print all cats first
        System.out.println("Cats Names:");
        boolean foundCat = false;
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Cat) {
                System.out.println(pets[i].getName());
                foundCat = true;
            }
        }
        if (!foundCat) {
            System.out.println("No cats entered.");
        }

        // Print all dogs next
        System.out.println("\nDogs Names:");
        boolean foundDog = false;
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Dog) {
                System.out.println(pets[i].getName());
                foundDog = true;
            }
        }
        if (!foundDog) {
            System.out.println("No dogs entered.");
        }

        scanner.close(); // Close the scanner
    }
}




