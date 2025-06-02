package Q_01;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        System.out.println("\nPet speak: "+pet.speak());
        pet.setName("Scooby");
        System.out.println( "Pet name:  "+pet.getName());

        Dog dog = new Dog();
        dog.setName("Jacky");
        System.out.println("\nDog speak: " +dog.speak());
        System.out.println("Dog name:  "+dog.getName());

        Cat cat  = new Cat();
        cat.setName("Stella");
        System.out.println("\nCat speak: "+cat.speak());
        System.out.println("Cat name: "+cat.getName());



    }
}
