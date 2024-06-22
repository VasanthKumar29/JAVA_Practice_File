package Oops_Practice.Inheritance;

public class Inheritance {
  public static void main(String[] args) {
    // Create an instance of the Animal class
    Animal genericAnimal = new Animal("Generic Animal");
    System.out.println("Animal Name: " + genericAnimal.getName());
    genericAnimal.makeSound();

    // Create an instance of the Dog class
    Dog dog = new Dog("Buddy");
    System.out.println("Dog Name: " + dog.getName());
    dog.makeSound(); // This will call the overridden method in Dog class
    dog.fetch();
  }
}

class Animal {
  // Fields (attributes) of the Animal class
  protected String name;

  // Constructor to initialize the Animal object
  public Animal(String name) {
    this.name = name;
  }

  // Method to simulate the sound an animal makes
  public void makeSound() {
    System.out.println("Animal makes a sound");
  }

  // Method to get the animal's name
  public String getName() {
    return name;
  }

  // Method to set the animal's name
  public void setName(String name) {
    this.name = name;
  }
}

class Dog extends Animal {
  // Constructor to initialize the Dog object
  public Dog(String name) {
    // Call the constructor of the parent class (Animal)
    super(name);
  }

  // Overriding the makeSound method of the parent class

  @Override
  public void makeSound() {
    System.out.println("Dog barks");
  }

  // Additional method specific to the Dog class
  public void fetch() {
    System.out.println(name + " is fetching the ball.");
  }
}
