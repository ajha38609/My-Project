package inheritanceDemo;

public class OverLoading {
	// In a class can we have methods with same name..?
	//method with same name can exisit in a class but each method should have
	public int sum()
	{
		//local variables: variables within a method
		//the scope of variables is only within this methods
		
		int a=10;
		int b=20;
		int result = a+b;
		return result;
	}
	public int sum(int a, int b)
	{
		//local variables: variables within a method
		//the scope of variables is only within this methods
		int a1=10;
		int b1=20;
		int result = a1+b1;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading obj = new OverLoading();
		System.out.println(obj.sum());
		System.out.println(obj.sum());
		
	}

}
