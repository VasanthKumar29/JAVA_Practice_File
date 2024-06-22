package Oops_Practice.Abstraction;

public class Interface01 {
  public static void main(String[] args) {
    Animal myDog = new Dog();
    Animal myCat = new Cat();

    myDog.makeSound();
    myDog.eat();

    myCat.makeSound();
    myCat.eat();
  }
}

interface Animal {
  void makeSound();

  void eat();
}

class Dog implements Animal {
  @Override
  public void makeSound() {
    System.out.println("Dog barks");
  }

  @Override
  public void eat() {
    System.out.println("Dog is eating");
  }
}

class Cat implements Animal {
  @Override
  public void makeSound() {
    System.out.println("Cat meows");
  }

  @Override
  public void eat() {
    System.out.println("Cat is eating");
  }
}
