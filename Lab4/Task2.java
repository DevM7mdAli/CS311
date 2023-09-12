package Lab4;

import java.util.Scanner;


public class Task2 {
    public static Boolean valid(String n){
      int co = 0;
    for (int i = 0 ; i < n.length(); i++){
      if(!Character.isLetterOrDigit(n.charAt(i))){
        return false ; 
        }
      if(Character.isDigit(n.charAt(i))){
        co++;
      }

      }
      if(co >= 2 && n.length() >= 8){
        return true;
      }
      else{
        return false;
      }
    }

  public static void main(String[] args){
    Scanner In = new Scanner(System.in);
    System.out.println("1. A password must have at least eight characters. \n" + //
                        "2. A password consists of only letters and digits. \n" + //
                        "3. A password must contain at least two digits \n\n ");

    System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String Pass = In.next();
    if(valid(Pass)){
      System.out.println("this password is valid " + Pass);
    }
    else{
      System.out.println("this password is not valid " + Pass);
    }
    In.close();
  }
}
