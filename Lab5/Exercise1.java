package Lab5;

public class Exercise1{
  //task 9
  public static void main(String[] args){
    Rectangle First = new Rectangle(40,4);
    Rectangle Second = new Rectangle(35.9,3.5);
      System.out.println();
    System.out.println("the Area for the first rec = " + First.getArea() + " And the parameter = " + First.getParameter());
      System.out.println();
    System.out.println("the Area for the Second rec = " + Second.getArea() + " And the parameter = " + Second.getParameter());
  }
}

// task 7
class Rectangle{
  double height;
  double width;

  public Rectangle(){  
  }

  public Rectangle(double height, double width ){  
    this.height = height;
    this.width = width;
  }

  public double getArea(){
    return width * height;
  }

  public double getParameter(){
    return (width * 2) + (height * 2);
  }
}