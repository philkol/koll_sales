import java.util.ArrayList;

public class Customers 
{
	private ArrayList <Customer> customerlist;
	
	public Customers()
	{
		customerlist=new ArrayList <>();
	}
	
	public void addCustomers(Customer customer)
	{
		customerlist.add(customer);
	}
	
}
