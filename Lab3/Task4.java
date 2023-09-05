package Lab3;

import java.util.Scanner;

public class Task4 {
  public static void main(String[] args){
    Scanner Reader = new Scanner(System.in);
    System.out.print("Enter a Sentence: ");
      String sentence = Reader.nextLine();
    int counter = 1;
    for(int i = 0; i < sentence.length(); i++){
      if(sentence.charAt(i) == ' '){
        counter++;
      }
    }
    System.out.print("the number of words Are: " + counter);
    Reader.close();
  }
}