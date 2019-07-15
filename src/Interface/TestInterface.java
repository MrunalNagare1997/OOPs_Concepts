package Interface;
import java.util.Scanner;
public class TestInterface {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String address;
        String name;
        RBL obj=new RBL("Pune","Kothrud","Kothrud");

        System.out.println("Enter the name and address...");
        name= sc.next();
        address=sc.next();

        Customer cust= new Customer(name,address,1234534,500,"Savings");
        obj.addCustomer(cust);

        cust.displayCustomerInfo();

        obj.credit(500,cust.getAccount());

        cust.displayCustomerInfo();

        obj.showBankDetails();
    }

}
