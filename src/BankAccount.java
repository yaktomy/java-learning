public class BankAccount {
    private String owner;
    private double balance;
    public  BankAccount(String owner, double balance){
        this.balance = balance;
        this.owner = owner;
    }
    public void deposit(double sum){
        balance += sum;
    }
    public void withdraw(double sum)
    throws InsufficientFundsException{
        if (sum < 0){
            throw new IllegalArgumentException(
                    "Отрицательная сумма"
            );
        }
        if (sum > balance){
            throw new InsufficientFundsException(
              "Сумма для снятия больше, чем ваш баланс"
            );


        }
        balance -= sum;

    }
}
