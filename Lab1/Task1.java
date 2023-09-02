import java.util.Scanner;

public class Task1 {
  public static void main(String[] args){
    // Task 1 Q Write a Java program that takes the birth year from the user and prints her/his age :
    int age;
    Scanner myInput = new Scanner(System.in); // Init Scanner and the name of scanner is myInput you can name it anything
    System.out.print("Enter your date of birth: ");
    age = myInput.nextInt(); // take input from the user
    age = 2023 - age; 
    System.out.println("Your Age is " + age);
    myInput.close();
  }
}
