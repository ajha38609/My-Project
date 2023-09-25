package exceptionPracticies;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 9;
		int j = 0;
		try
		{
			System.out.println("Result" + i/j);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Please do not give 0 as value of j");
			
		}
		//Handle the exception
		//Can be done using try and catch block
System.out.println("Result for addition" + i+j);
System.out.println("Result for multiplication" + i*j);
System.out.println("Result for substraction" + (i-j));

	}
     
}
