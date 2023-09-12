package Lab4;


import java.util.Scanner;
enum Machin{ON,OFF,IN_PROGRESS,START,DONE};


public class Task4 {
  public static void checkStat(Machin press){
    switch(press){
      case ON: System.out.println("The machine is ON");
      break;
      case OFF: System.out.println("The machine is OFF, GOOD BYE");
      break;
      case START: System.out.println("The machine is starting");
      break;
      case IN_PROGRESS: System.out.println("The machine in progress");
      break;
      case DONE: System.out.println("The machine is Done");
      break;
      default: System.out.println("wrong button pressed");
      break;
    }
}
  public static void main(String[] args){
  Scanner Inp = new Scanner(System.in);
    System.out.print("Press a button the buttons are (ON,OFF,IN_PROGRESS,START,DONE)");
    String Pressed = Inp.nextLine().toUpperCase();
    checkStat(Machin.valueOf(Pressed));
  Inp.close();
  }
  
}
