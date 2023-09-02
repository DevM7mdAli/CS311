package Lab2;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args){
    
    //Task 3 part 3 Q Write a Java program that compares between three input string names by displaying the longest string.
    Scanner stringInput = new Scanner(System.in);
    System.out.print("Enter The First Word: ");
      String word1 = stringInput.nextLine();
    System.out.print("Enter The Second Word: ");
      String word2 = stringInput.nextLine();
    System.out.print("Enter The 3rd Word: ");
      String word3 = stringInput.nextLine(); 
    if(word1.length() > word2.length() && word1.length() > word3.length())
      {
        System.out.println("The First word is the longest: "+ word1);
      }
    else if(word2.length() > word1.length() && word2.length() > word3.length())
      {
        System.out.println("The Second word is the longest: "+ word2);
      }
    else if(word3.length() > word1.length() && word3.length() > word2.length())
      {
        System.out.println("The 3rd word is the longest: "+ word3);
      }
      else
      {
        System.out.println("The Words Are Equal or two of Three.");
      }
    stringInput.close();
    
  }
}

