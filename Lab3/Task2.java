package Lab3;

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    System.out.print("enter your name: ");
    String Name = Input.nextLine();
    System.out.print("enter your age: ");
    int age = Input.nextInt();
    System.out.println("Your PAssword is : " + age + Name);
    Input.close();
  }
}
