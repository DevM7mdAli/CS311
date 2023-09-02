package Lab2;

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args){
        //Task 2 part 2 Q Write a Java program using SWITCH statement, that takes a month value as input and display its corresponding name and number of days. Note: The system should check that the month should not be greater than 12.
    Scanner Input = new Scanner(System.in);
    System.out.print("Enter A month Number: ");
    int month = Input.nextInt();
    if(month <= 12 && month > 0)
      {
        switch(month)
          {
          case 1:
            System.out.println("the month is: jan 31 days");
            break;
          case 2:
            System.out.println("the month is: feb 28 days");
            break;
          case 3:
            System.out.println("the month is: mar 31 days");
            break;
          case 4:
            System.out.println("the month is: apr 30 days");
            break;
          case 5:
            System.out.println("the month is: may 31 days");
            break;
          case 6:
            System.out.println("the month is: jun 30 days");
            break;
          case 7:
            System.out.println("the month is: jul 31 days");
            break;
          case 8:
            System.out.println("the month is: aug 31 days");
            break;
          case 9:
            System.out.println("the month is: sep 30 days");
            break;
          case 10:
            System.out.println("the month is: oct 31 days");
            break;
          case 11:
            System.out.println("the month is: Nov 30 days");
            break;
          case 12:
            System.out.println("the month is: Dec 31 days");
            break;
          }
      }
    else
      {
        System.out.println("The Value Doesn't Exist Try Again");
      }
    Input.close();
  }
}
