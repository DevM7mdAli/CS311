package Lab6;

public class Bill {
  public static void billTotal(Order [] order , int length){
    int total = 0;
    for(int i = 0 ; i < length ; i++){
      System.out.println("the item is: " + order[i].getOrderName() + " and the price is " + order[i].getOrderPrice());
      total += order[i].getOrderPrice();
    }
    System.out.println("the total is " + total + " Number of Items " + length);
  }
}
