package inheritanceDemo;

public class MethodsDemo2 {
	//Global variable: variables which are declared at class level
	//MEthods which return a value--> return statement
	int x= 100;
	String str3 = "JAVA";
	public int sum()
	{
		//local variables: variables within a method
		//the scope of variables is only within this methods
		//
		int a=10;
		int b=20;
		int result = a+b+x;
		return result;
	}
	public String concatmethod()
	{
		String str1= "selenium";
		String str2= "Training";
		String result= str1+str2+str3;
		return result;
	}
	public void printmethod()
	{
		System.out.println("The global integer :" +x);
		System.out.println("The global integer :" + str3);
	}
	public static void main(String[] args) {
		MethodsDemo2 obj = new MethodsDemo2();
		System.out.println(obj.concatmethod());
		int value = obj.sum();
		
		System.out.println(value);
		obj.printmethod();
		
		// TODO Auto-generated method stub

	}

}
