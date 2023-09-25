package exceptionPracticies;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finally block will not be written alone
		// any code in this block will try block or try and catch block
		
		
		
		
		int i = 9;
		int j = 0;
		try {
		System.out.println("Result" + i/j);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
		System.out.println("Result for addition" + i+j);
		System.out.println("Result for multiplication" + i*j);
		System.out.println("Result for substraction" + (i-j));
		}

	}

}
