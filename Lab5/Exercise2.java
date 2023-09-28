package Lab5;
import java.util.Date;

public class Exercise2 {
  public static void main(String[] args){
    Account Mohammed = new Account(1122, 20000, 4.5);
      System.out.println();
    System.out.println("the amount before withdraw: " + Mohammed.getBalance() + "\nAnd after withraw 2500: " + Mohammed.withdraw(2500));
      System.out.println();
    System.out.println("the balance before deposit: " + Mohammed.getBalance() + "\nthe amount after deposit 3000: " + Mohammed.deposit(3000));
      System.out.println();
    System.out.println("the monthly intrest is: " + Mohammed.getMonthlyInterest());
      System.out.println();
    System.out.println("the account created at: " + Mohammed.getDate());
  }
}

class Account{
  private int id;
  private double balance;
  private double annualInterestRate ;
  private Date dateCreated = new Date();

  Account(){}


  Account(int id , double balance , double annualInterestRate){
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
  }

  public void setId(int id){
    this.id = id;
  }

  public void setBalance(double balance){
    this.balance = balance;
  }

  public void setAnnualInterestRate(double annualInterestRate){
  this.annualInterestRate = annualInterestRate;
  }

  public void setDate(Date dateCreated){
    this.dateCreated = dateCreated;
  }

  public int getId() {
    return id;
  }

  public double getBalance() {
    return balance;
  }

  public double getAnnualInterestRate(){
    return annualInterestRate;
  }

  public Date getDate(){
    return dateCreated;
  }

  public double getMonthlyInterestRate(){
    return annualInterestRate / 12 ;
  }

  public double getMonthlyInterest(){
    return (getAnnualInterestRate() * balance);
  }

  public double withdraw(double amount){
    double after = this.balance - amount;
    setBalance(after);
    return after; 
  }

  public double deposit(double amount){
    double after = this.balance + amount;
    setBalance(after);
    return after; 
    }
}
