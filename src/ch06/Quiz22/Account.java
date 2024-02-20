package ch06.Quiz22;

public class Account {
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
            return;
        } else this.balance = balance;
    }

    private int balance;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
}
