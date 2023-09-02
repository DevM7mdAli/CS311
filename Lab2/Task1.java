package Lab2;

import java.util.Scanner;

public class Task1 {
      //Task 1 part 2 Q Write a Java program that takes three numbers as input then calculates and prints the average of the numbers and display the max and min number. Note: If any input number is negative then the system should display proper message and ask the user to try again.
    public static void main(String[] args){
    Scanner ThreeNumb = new Scanner(System.in);
    System.out.print("Enter The First Value: ");
      int x = ThreeNumb.nextInt();
    System.out.print("Enter The Second Value: ");
      int y = ThreeNumb.nextInt();
    System.out.print("Enter The 3rd Value: ");
      int z = ThreeNumb.nextInt();
    if(x < 0 || y < 0 || z < 0)
      {
        System.out.print("Try Again You entered a Wrong value");
      }
    else
      {
        int max1 = Math.max(x, y);
        int min1 = Math.min(x, y);
        System.out.println("The Average is: " + (3.0/x+y+z));
        System.out.println("The max Value is: "+ Math.max(max1, z)); // Math lib
        System.out.println("The min Value is: "+ Math.min(min1, z)); // Math lib
      }
      ThreeNumb.close();
    }
}
