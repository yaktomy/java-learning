import java.util.*;


public class Main {

  public static void main(String[] args) {
    BankAccount account = new BankAccount("Марселина", 1278);
    try{
      account.withdraw(-465);
    } catch (InsufficientFundsException e){
      System.out.println(e.getMessage());
    }catch (IllegalArgumentException e){
      System.out.println(e.getMessage());
    }
  }
}



