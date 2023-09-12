package Lab4;
import java.util.Scanner;


public class Tasl1 {

  public static void getClassfic(double av , int i){
    if (av >= 6){
      System.out.println("week#" + (i + 1) + " High " + av);
    }
    else if (av > 3){
      System.out.println("week#" + (i + 1) + " mid " + av);
    }
    else{
            System.out.println("week#" + (i + 1) + " low " + av);
    }
  }
  public static void main(String[] args){
    System.out.println("plz ennter the rainfall rate for 4 weeks");
    Scanner In = new Scanner(System.in);
    double [][] Month = new double[4][7];
    for(int i = 0 ; i < 4 ; i++){
      System.out.print("Week#" + (i+1) + ' ');
      for(int j = 0 ; j < 7 ; j++){
        Month[i][j] = In.nextDouble();
      }
    }
      double sum , avg;
        System.out.println("class for each week:");
        for(int i = 0 ; i < 4 ; i++){
          sum = 0;
          for(int j = 0 ; j < 7 ; j++){
            sum += Month[i][j];
          }
          avg = sum / 7;
          getClassfic(avg , i);
        }
    In.close();
  }
}
