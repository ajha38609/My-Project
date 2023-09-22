package inheritanceDemo;

public class Base {
	//This is goinig to be my parent class
	// default accessmodifier
	
	public void openbrower(String browser)
	{
		System.out.println("Open the broswer" + browser);
		
	
	}
	// statics: This method can be calles without object in any class
		public static void login(String username,String password)
		{
			System.out.println("Enter Username" + username );
			System.out.println("Enter Username" + password);
			System.out.println("Enter Username" +password);
		}
		
		public void ComposeEmail(String text)
		{
			System.out.println("Compose an Email" + text); 
			
		}
		public void logout()
		{
			System.out.println("Click on logout buttom");
			
		}
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
