package Lab3;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
  String maxName = "";
  String Name = "";
  int maxScore = 0, Score = 0;
    System.out.print("enter the number of student");
    Scanner Input = new Scanner(System.in);
    int iter = Input.nextInt();
    for (int i = 0; i < iter; i++) {

      System.out.print("the name and the score of student " + (i + 1) + ':');
      Name = Input.next();
      Score = Input.nextInt();
        if (Score > maxScore) {
        maxScore = Score;
        maxName = Name;
        }
    }
    System.out.println("the high score is for the: " + maxName + " the score is : " + maxScore);
    Input.close();
  }
}