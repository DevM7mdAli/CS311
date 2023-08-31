import java.util.Scanner;
import java.lang.Math;
public class Welcome
{
  public static void main(String[] args)
  {
    // Task 1 Q Write a Java program that takes the birth year from the user and prints her/his age :
    /* 
    int age;
    Scanner myInput = new Scanner(System.in);
    System.out.print("Enter your date of birth: ");
    age = myInput.nextInt();
    age = 2023 - age;
    System.out.println("Your Age is " + age);
    myInput.close();
    */

    // Task 2 Q Write a program that converts a Fahrenheit degree to Celsius using the formula: celsius = ( 5 )( fahrenheit - 32) convert it to Celsius and then display result.
    /* 
    double cel;
    Scanner Input = new Scanner(System.in);
    System.out.println("----------------------- convert to celsius -----------------------\n");
    System.out.print("Enter fehrinhite to convert");
    cel = Input.nextDouble();
    cel = 5/9 * (cel - 32);
    System.out.println("the cel is" + cel);
    Input.close();
    */


    //Task 1 part 2 Q Write a Java program that takes three numbers as input then calculates and prints the average of the numbers and display the max and min number. Note: If any input number is negative then the system should display proper message and ask the user to try again.
    /*
    Scanner ThreeNumb = new Scanner(System.in);
    System.out.println("Enter Three Value");
      int x = ThreeNumb.nextInt();
      int y = ThreeNumb.nextInt();
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
    */

    //Task 2 part 2 Q Write a Java program using SWITCH statement, that takes a month value as input and display its corresponding name and number of days. Note: The system should check that the month should not be greater than 12.
    /*
    Scanner Input = new Scanner(System.in);
    System.out.print("Enter A month Number: ");
    int month = Input.nextInt();
    if(month <= 12 && month > 0)
      {
        switch(month)
        {
          case 1:
            System.out.println("the month is: jan");
            break;
          case 2:
            System.out.println("the month is: feb");
            break;
          case 3:
            System.out.println("the month is: mar");
            break;
          case 4:
            System.out.println("the month is: apr");
            break;
          case 5:
            System.out.println("the month is: may");
            break;
          case 6:
            System.out.println("the month is: jun");
            break;
          case 7:
            System.out.println("the month is: jul");
            break;
          case 8:
            System.out.println("the month is: aug");
            break;
          case 9:
            System.out.println("the month is: sep");
            break;
          case 10:
            System.out.println("the month is: oct");
            break;
          case 11:
            System.out.println("the month is: Nov");
            break;
          case 12:
            System.out.println("the month is: Dec");
            break;
        }
      }
    else
      {
        System.out.println("The Value Doesn't Exist");
      }
    Input.close();
    */

    //Task 3 part 3 Q Write a Java program that compares between three input string names by displaying the longest string.
    Scanner stringInput = new Scanner(System.in);
    System.out.print("Enter 3 Words: ");
    String word1 = stringInput.nextLine(); 
    String word2 = stringInput.nextLine(); 
    String word3 = stringInput.nextLine(); 
    if(word1.length() > word2.length())
      {
        if(word1.length() > word3.length())
          {
            System.out.println("The First word is the longest: "+ word1);
          }
      }
    if(word2.length() > word1.length())
      {
        if(word2.length() > word3.length())
          {
            System.out.println("The Second word is the longest: "+ word2);
          }
      }
    if(word3.length() > word2.length())
      {
        if(word3.length() > word1.length())
          {
            System.out.println("The 3rd word is the longest: "+ word3);
          }
      }
    stringInput.close();
  }
}