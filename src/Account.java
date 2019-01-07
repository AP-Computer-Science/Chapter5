public class Account implements Lockable {

    private final double RATE = 0.035; // interest rate of 3.5%
    private int acctNumber;
    private double balance;
    private String name;
    private boolean _isLocked = false;
    private int _key = 0;
    public Account(String owner, int account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    public Account(String owner, int account) {
        balance = 0;
        acctNumber = account;
        name = owner;
    }
    public String getName() {
        if(_isLocked) {
            System.out.println("Unable to get name: Account locked.");
            return "Locked Account";
        }
        return name;
    }
    public double getBalance() {
        if(_isLocked) {
            System.out.println("Unable to get balance: Account locked.");
            return 0;
        }
        return balance;
    }
    public void deposit(double amount) {
        if(_isLocked) {
            System.out.println("Unable to deposit: Account locked.");
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if(_isLocked) {
            System.out.println("Unable to withdraw: Account locked.");
            return;
        }
        balance -= amount;
    }
    public void move(Account destination, double amount) {
        if(_isLocked || destination.isLocked()) {
            System.out.println("Cannot move money: One of the accounts is locked.");
            return;
        }
        if(amount > balance) {
            System.out.println("You cannot transfer more then you have in a overdraft protected account.");
            return;
        }
        if(amount < 0) {
            System.out.println("Good try, smarty.");
            return;
        }
        withdraw(amount);
        destination.deposit(amount);
    }
    private boolean isValid(int key) {
        return key == _key;
    }
    public void lock(int key) {
        if(isValid(key)) {
           _isLocked = true; 
        }
    }

    public void unlock(int key) {
        if(isValid(key)) {
            _isLocked = false;
        }
    }

    public void setKey(int key) {
        _key = key;
    }

    public boolean isLocked() {
        return _isLocked;
    }
}