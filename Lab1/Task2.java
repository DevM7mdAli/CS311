import java.util.Scanner;
public class Task2 {
  public static void main(String[] args){
    // Task 2 Q Write a program that converts a Fahrenheit degree to Celsius using the formula: celsius = ( 5 )( fahrenheit - 32) convert it to Celsius and then display result.
    double cel;
    Scanner Input = new Scanner(System.in);
    System.out.println("----------------------- convert to celsius -----------------------\n");
    System.out.print("Enter fehrinhite to convert: ");
    cel = Input.nextDouble();
    cel = 5.0/9 * (cel - 32);
    System.out.println("the cel is: " + cel);
    Input.close();
  }
}
