package inheritanceDemo;

public class ParameterDemo {
	public void login(String username,String password)
	{
		System.out.println("Enter Username" + username );
		System.out.println("Enter Username" + password);
		System.out.println("Enter Username" +password);
	}
	
	public void ComposeEmail(String text)
	{
		System.out.println("Compose an Email" + text); 
		
	}
	public void Login()
	{
		System.out.println("Click on logout buttom");
		
	}
	
	public static void main(String[] args)  {
		ParameterDemo obj=new ParameterDemo();
	    obj.login("Ashu", "admin@123");
	    obj.ComposeEmail("Hello All");
	    obj.login("admin","admin");
		
		// TODO Auto-generated method stub

	}

}
