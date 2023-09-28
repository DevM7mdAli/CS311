package Lab6;

public class Order {

    public static int NumberOfOrders;
    private String orderName;
    private double orderPrice;

      public String getOrderName(){
        return this.orderName;
      }

      public double getOrderPrice(){
        return this.orderPrice;
      }

    Order(String orderName ,double orderPrice){
      this.orderName = orderName;
      this.orderPrice = orderPrice;
      NumberOfOrders++;
    }


  public static void main(String[] args){
    Order order1 = new Order("Rice", 30);
    Order order2 = new Order("Pasta", 40);
    Order All[] = {order1 , order2};
    Bill.billTotal(All, All.length);
  }
}