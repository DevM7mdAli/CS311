package Lab3;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args){
    Scanner Input = new Scanner(System.in);
    System.out.print("Enter A String: ");
      String UserInput = Input.nextLine();
              int occ=0;
    for(int i = 0; i < UserInput.length(); i++){
      String newString = "";
        if((UserInput.charAt(i) == 'm' || UserInput.charAt(i) == 'M') && occ < 3 ){
          occ++;
          continue;
        }
      newString += UserInput.charAt(i);
      System.out.print(newString);
    }
    Input.close();
  }
}
