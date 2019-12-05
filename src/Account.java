public class Account {
    private int balance;

    public Account(){//company has 10000tl at the beginning
        setBalance(10000);
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void increaseBalance(int money){
        setBalance(this.balance+money);
    }
    public void decreaseBalance(int money){
        setBalance(this.balance-money);
    }

}
