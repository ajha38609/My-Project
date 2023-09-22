package inheritanceDemo;

public class Payments extends HomePage {
	//This calss is child to Homepage and grandchild to base calss
	//This is multilevel inheritance
	public void payments()
	{
		System.out.println("Test Payments page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments obj = new Payments();
		obj.openbrower("Chrome");            // Base class
		login("admin", "admin@123");     // BAse class
		obj.Homepagetest();                  // Home page class
        obj.payments();                      // current class
        obj.logout();                        //Base class
	}

}
