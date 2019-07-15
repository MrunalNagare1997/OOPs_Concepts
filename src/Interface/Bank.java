package Interface;



public interface Bank {

    public void debit(int amount, Account account);
    public void credit(int amount, Account account);
    public void addCustomer(Customer customer);


}

class Account
{
    private long accountNo;
    private int balance;
    private String accountHolder;
    private String type;

    public Account() {
        accountNo=00000000;
        balance=0000;
        accountHolder="N/A";
        type="N/A";
    }

    public Account(long accountNo, int balance, String accountHolder, String type) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.type = type;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }
    public long getAccountNo()
    {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showAccountDetails()
    {
        System.out.println("\n\n...Account Information...");
        System.out.print("\nAccount Holder: "+getAccountHolder());
        System.out.print("\nAccount Number: "+accountNo);
        System.out.print("\nAccount Type: "+getType());
        System.out.print("\nAccount Balance: "+getBalance());
    }
}

class Customer {

    private String name;
    private Account account;
    private String address;


    public Customer(String name, String address,long accountNo,int balance,String accountType) {
        this.name = name;
        this.address = address;
        account=new Account(accountNo,balance,name,accountType);
    }

    public Customer() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public int  getBalance(){
        return account.getBalance();
    }
    public long getAccountNo()
    {
        return account.getAccountNo();
    }

    public void displayCustomerInfo()
    {
        System.out.print("\n\n...Customer info...");

        System.out.print("\nCustomer Name: "+name);
        System.out.print("\nAddress: "+address);
        account.showAccountDetails();


    }
}

class RBL implements Bank
{

    private String bankName;
    private String branch;
    private String branchAddress;
    private Customer [] customer;
    private int customerCount;


    public RBL()
    {
        bankName="RBL";
        branch="N/A";
        branchAddress="N/A";
        customer=new Customer[10];
        customerCount=0;

    }

    public RBL(String bankName, String branch, String branchAddress) {
        this.bankName = bankName;
        this.branch = branch;
        this.branchAddress = branchAddress;
        customer=new Customer[10];
        customerCount=0;
    }

    @Override
    public void debit(int amount, Account account) {

        if(account.getBalance()>=amount)
        {
            account.setBalance(account.getBalance()-amount);
        }
        else
            System.out.println("\n\nInsufficient Funds...");

    }

    @Override
    public void credit(int amount, Account account) {
        account.setBalance(account.getBalance()+amount);
    }

    @Override
    public void addCustomer(Customer customer)
    {
        if(customerCount<10)
        {
            customerCount++;
            this.customer[customerCount]= customer;
        }
    }

    public void showBankDetails()
    {
        System.out.println("\n\nBank Details...");
        System.out.print("\nBank Name: "+bankName);
        System.out.print("\nBranch Name: "+branch);
        System.out.print("\nAddress: "+branchAddress);
        System.out.println("\nCustomre count: "+customerCount);
    }

}