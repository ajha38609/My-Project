package inheritanceDemo;

public class HomePage extends Base {
	//This is goinig to be child class
	public void Homepagetest()
	{
		System.out.println("Test for Home Page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create object of child class
		HomePage obj = new HomePage();
		obj.openbrower("Chrome");
		login("admin","admin");
		obj.Homepagetest();
		obj.logout();
		

	}

}
