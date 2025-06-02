package Q_02;

import Q_01.Cat;
import Q_01.Dog;
import Q_01.Pet;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args){
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

            }

        System.out.println("\nList of pets:");
        for (int i = 0; i < count; i++) {
            Pet pet = pets[i];
            String type = (pet instanceof Cat) ? "Cat" : "Dog";
            System.out.println("Name: " + pet.getName() + ", Type: " + type);
        }

        scanner.close();
    }
}


