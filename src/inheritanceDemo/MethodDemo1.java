package inheritanceDemo;

public class MethodDemo1 {
	public void login()
	{
		System.out.println("Enter Username");
		System.out.println("Enter Username");
		System.out.println("Enter Username");
	}
	
	public void ComposeEmail()
	{
		System.out.println("Compose an Email");
		
	}
	public void Login()
	{
		System.out.println("Click on logout buttom");
		
	}
	
	public static void main(String[] args) {
		MethodDemo1 obj = new MethodDemo1();
		obj.login();
		obj.ComposeEmail();
		obj.Login();
	

	}

}
