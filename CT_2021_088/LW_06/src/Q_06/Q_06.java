package Q_06;
import Q_01.Cat;
import Q_01.Dog;
import Q_01.Pet;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        Cat[] cats = new Cat[100];
        Dog[] dogs = new Dog[100];

        int petCount = 0;
        int catCount = 0;
        int dogCount = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": // Add Cat
                    System.out.print("Enter cat name: ");
                    String catName = scanner.nextLine();
                    System.out.print("Enter coat color: ");
                    String coatColor = scanner.nextLine();

                    Cat newCat = new Cat();
                    newCat.setName(catName);
                    newCat.setCoatColor(coatColor);

                    if (petCount < 100 && catCount < 100) {
                        pets[petCount++] = newCat;
                        cats[catCount++] = newCat;
                        System.out.println("Cat added.");
                    } else {
                        System.out.println("Cannot add more cats.");
                    }
                    break;

                case "2": // Add Dog
                    System.out.print("Enter dog name: ");
                    String dogName = scanner.nextLine();

                    double weight = -1;
                    while (weight <= 0) {
                        System.out.print("Enter weight (positive number): ");
                        try {
                            weight = Double.parseDouble(scanner.nextLine());
                            if (weight <= 0) {
                                System.out.println("Weight must be greater than 0.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number.");
                        }
                    }

                    Dog newDog = new Dog();
                    newDog.setName(dogName);
                    newDog.setWeight(weight);

                    if (petCount < 100 && dogCount < 100) {
                        pets[petCount++] = newDog;
                        dogs[dogCount++] = newDog;
                        System.out.println("Dog added.");
                    } else {
                        System.out.println("Cannot add more dogs.");
                    }
                    break;

                case "3": // Remove Cat
                    System.out.print("Enter cat name to remove: ");
                    String removeCatName = scanner.nextLine();

                    boolean catFound = false;
                    for (int i = 0; i < catCount; i++) {
                        if (cats[i].getName().equalsIgnoreCase(removeCatName)) {
                            for (int j = i; j < catCount - 1; j++) {
                                cats[j] = cats[j + 1];
                            }
                            cats[--catCount] = null;
                            catFound = true;
                            break;
                        }
                    }

                    if (catFound) {
                        for (int i = 0; i < petCount; i++) {
                            if (pets[i] instanceof Cat && pets[i].getName().equalsIgnoreCase(removeCatName)) {
                                for (int j = i; j < petCount - 1; j++) {
                                    pets[j] = pets[j + 1];
                                }
                                pets[--petCount] = null;
                                break;
                            }
                        }
                        System.out.println("Cat removed.");
                    } else {
                        System.out.println("Cat not found.");
                    }
                    break;

                case "4": // Remove Dog
                    System.out.print("Enter dog name to remove: ");
                    String removeDogName = scanner.nextLine();

                    boolean dogFound = false;
                    for (int i = 0; i < dogCount; i++) {
                        if (dogs[i].getName().equalsIgnoreCase(removeDogName)) {
                            for (int j = i; j < dogCount - 1; j++) {
                                dogs[j] = dogs[j + 1];
                            }
                            dogs[--dogCount] = null;
                            dogFound = true;
                            break;
                        }
                    }

                    if (dogFound) {
                        for (int i = 0; i < petCount; i++) {
                            if (pets[i] instanceof Dog && pets[i].getName().equalsIgnoreCase(removeDogName)) {
                                for (int j = i; j < petCount - 1; j++) {
                                    pets[j] = pets[j + 1];
                                }
                                pets[--petCount] = null;
                                break;
                            }
                        }
                        System.out.println("Dog removed.");
                    } else {
                        System.out.println("Dog not found.");
                    }
                    break;

                case "0": // Quit and show final list
                    System.out.println("\nFinal List of Cats:");
                    if (catCount == 0) {
                        System.out.println("No cats.");
                    } else {
                        for (int i = 0; i < catCount; i++) {
                            System.out.println("Name: " + cats[i].getName() +" , Type:Cat " + " , Coat Color: " + cats[i].getCoatColor());
                        }
                    }

                    System.out.println("\nFinal List of Dogs:");
                    if (dogCount == 0) {
                        System.out.println("No dogs.");
                    } else {
                        for (int i = 0; i < dogCount; i++) {
                            System.out.println("Name: " + dogs[i].getName() +" , Type: Dog " + " , Weight: " + dogs[i].getWeight());
                        }
                    }

                    System.out.println("\nExiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number from 0 to 4.");
            }
        }
    }
}
