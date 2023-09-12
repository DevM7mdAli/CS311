package Lab4;

import java.util.Scanner;

public class Task3 {

public static String deleteChar(String in , char De){
  String newS ="";
  for(int i = 0 ; i < in.length() ; i++){
    if(in.charAt(i) == De){
      continue;
    }
    else{
      newS += in.charAt(i);
    }
  }
  return newS;
}
  public static void main(String[] args){
    Scanner In = new Scanner(System.in);
    System.out.print("Type an word: ");
      String userIn = In.nextLine();
    System.out.print("enter a Char to delete: ");
      char  Del = In.nextLine().charAt(0);
    
    userIn = deleteChar(userIn, Del);
    System.out.println("The string after deleting the character " +"'"+ Del +"'"+": " + userIn);
    
    In.close();
  }
}
