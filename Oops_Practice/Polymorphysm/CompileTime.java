package Oops_Practice.Polymorphysm;

public class CompileTime {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    int sum1 = calc.add(5, 10);
    int sum2 = calc.add(5, 10, 15);
    double sum3 = calc.add(5.5, 10.5);

    System.out.println("Sum of two integers: " + sum1);
    System.out.println("Sum of three integers: " + sum2);
    System.out.println("Sum of two doubles: " + sum3);
  }
}

class Calculator {

  // Method to add two integers
  public int add(int a, int b) {
    return a + b;
  }

  // Overloaded method to add three integers
  public int add(int a, int b, int c) {
    return a + b + c;
  }

  // Overloaded method to add two doubles
  public double add(double a, double b) {
    return a + b;
  }
}
