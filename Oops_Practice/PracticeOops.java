package Oops_Practice;

class Vehicle {
  protected String make;
  protected String model;

  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public void start() {
    System.out.println("The " + make + " " + model + " is starting.");
  }

  public void stop() {
    System.out.println("The " + make + " " + model + " is stopping.");
  }
}

class Car extends Vehicle {
  private int doors;

  public Car(String make, String model, int doors) {
    super(make, model);
    this.doors = doors;
  }

  public void openDoors() {
    System.out.println("Opening " + doors + " doors.");
  }
}

class ElectricCar extends Car {
  private int batteryCapacity;

  public ElectricCar(String make, String model, int doors, int batteryCapacity) {
    super(make, model, doors);
    this.batteryCapacity = batteryCapacity;
  }

  public void charge() {
    System.out.println("Charging the " + batteryCapacity + "kWh battery.");
  }
}

public class PracticeOops {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle("Generic", "Vehicle");
    Car car = new Car("Toyota", "Camry", 4);
    ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 4, 100);

    vehicle.start(); // The Generic Vehicle is starting.
    car.start(); // The Toyota Camry is starting.
    car.openDoors(); // Opening 4 doors.
    electricCar.start(); // The Tesla Model S is starting.
    electricCar.charge(); // Charging the 100kWh battery.
  }
}
