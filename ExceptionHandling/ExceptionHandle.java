package ExceptionHandling;

public class ExceptionHandle {
  public static void main(String[] args) {
    try {
      int n = Integer.parseInt("Vasanth");
      System.out.println("Int : " + n);
    } catch (Exception e) {
      System.out.println("Cant change the String into int");
    }

    int check = finallyBlockDemo();
    System.out.println("Check : " + check);
  }

  @SuppressWarnings("finally")
  public static int finallyBlockDemo() {
    try {
      return 5;
    } catch (Exception e) {
      return 1;
    } finally {
      return 2;// Overriding take place here
    }
  }
}