package Oops_Practice.Interface;

public class Interface {
  public static void main(String[] args) {
    Animal myDog = new Dog("Buddy");
    Animal myCat = new Cat("Whiskers");

    myDog.makeSound();
    myDog.eat();

    myCat.makeSound();
    myCat.eat();
  }
}

interface Animal {
  // Interface methods (by default, they are public and abstract)
  void makeSound();

  void eat();
}

class Dog implements Animal {
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  // Implementing the makeSound method
  @Override
  public void makeSound() {
    System.out.println(name + " says: Woof Woof!");
  }

  // Implementing the eat method
  @Override
  public void eat() {
    System.out.println(name + " is eating.");
  }
}

class Cat implements Animal {
  private String name;

  public Cat(String name) {
    this.name = name;
  }

  // Implementing the makeSound method
  @Override
  public void makeSound() {
    System.out.println(name + " says: Meow!");
  }

  // Implementing the eat method
  @Override
  public void eat() {
    System.out.println(name + " is eating.");
  }
}
