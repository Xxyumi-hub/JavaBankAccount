class Account {

    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.setAccountName(accountName);
        balance = initialBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    public void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;

    }


    public double getBalance()	// note "accessor" method
    {
        return balance;			// returns value of instance var
    }


    public static void main(String[] args) {
        Account usAccount = new Account("US account", 100.00);
        Account chAccount = new Account("Swiss account", 1000000.00);
        
        System.out.println("Intial state");
        System.out.println(usAccount.getAccountName());
        System.out.println(chAccount.getAccountName());
        
        usAccount.withdraw(20);
        System.out.println("The balance of the US account is now: " + usAccount.getBalance());
        chAccount.deposit(200);
        System.out.println("The balance of the Swiss account is now: " + chAccount.getBalance());
        
        System.out.println("Ending balances");
        System.out.println(usAccount.getAccountName());
        System.out.println(chAccount.getAccountName());
        
        Account brandNewAccount = new Account("Canada account", 100.00);
        brandNewAccount.deposit(20);
        System.out.println("The balance of the Canada account is now " + brandNewAccount.getBalance());
        
        }

}

/*
1. creates an account with a balance of 100.0
2. deposits 20.0 in it
3. finally prints the balance
*/