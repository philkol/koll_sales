
public class Customer 
{
	private int customerID;
	private String firstName;
	
	public Customer(int customerID, String firstName)
	{
		setCustomerID(customerID);
		setFirstName(firstName);
	}

	public int getCustomerID() 
	{
		return customerID;
	}

	public void setCustomerID(int customerID) 
	{
		this.customerID = customerID;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	
}
