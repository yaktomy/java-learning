import java.util.Scanner;
public class Main {
    public static class BankAcount{
        private String owner;
        private double balance;
        public BankAcount(){
            this.owner = "Марселина";
            this.balance = 1956;
        }
        public void printBalance(){
            System.out.println(balance);
        }
        public void deposit(){
            balance+= 1289;
        }
        public void withdraw(){
            balance-= 167;
        }
    }
    public static void main(String[] args) {
        BankAcount bankAcount = new BankAcount();
        bankAcount.printBalance();
        bankAcount.deposit();
        bankAcount.printBalance();
        bankAcount.withdraw();
        bankAcount.printBalance();
    }
}

