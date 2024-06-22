package Oops_Practice.Abstraction;

public class AbstractClass {
  public static void main(String[] args) {
    Animal myDog = new Dog();
    Animal myCat = new Cat();

    myDog.makeSound();
    myDog.sleep();

    myCat.makeSound();
    myCat.sleep();

    myDog.eat();
  }
}

abstract class Animal {
  // Abstract method (does not have a body)
  abstract void makeSound();

  abstract void eat();

  // Regular method with a body
  public void sleep() {
    System.out.println("Animal is sleeping");
  }
}

class Dog extends Animal {
  // @Override
  // void makeSound() {
  // System.out.println("Dog barks");
  // }
  void eat() {
    System.out.println("Dog eats");
  }

  @Override
  void makeSound() {

    System.out.println("Dog barks");
  }
}

class Cat extends Animal {
  @Override
  void makeSound() {
    System.out.println("Cat meows");
  }

  @Override
  void eat() {
    System.out.println("cat eat");
  }
}
