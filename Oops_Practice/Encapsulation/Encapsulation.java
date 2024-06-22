package Oops_Practice.Encapsulation;

public class Encapsulation {
  public static void main(String[] args) {
    // Creating an instance of the Person class
    Person person = new Person("John Doe", 25);

    // Accessing and modifying the private variables using public methods
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());

    // Modifying the values using setter methods
    person.setName("Jane Doe");
    person.setAge(30);

    // Printing the updated values
    System.out.println("Updated Name: " + person.getName());
    System.out.println("Updated Age: " + person.getAge());

    // Trying to set an invalid age
    person.setAge(-5); // This will trigger the validation in the setter method
  }
}

class Person {
  // Private variables to restrict direct access
  private String name;
  private int age;

  // Public constructor to initialize the object
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Getter method for name
  public String getName() {
    return name;
  }

  // Setter method for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter method for age
  public int getAge() {
    return age;
  }

  // Setter method for age
  public void setAge(int age) {
    if (age > 0) { // Simple validation to ensure age is positive
      this.age = age;
    } else {
      System.out.println("Please enter a valid age.");
    }
  }
}
