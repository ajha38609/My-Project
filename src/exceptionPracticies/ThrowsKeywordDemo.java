package exceptionPracticies;

public class ThrowsKeywordDemo {

	public void div(int a, int b) throws ArithmeticException {
		// TODO Auto-generated method stub
		if (b==0)
		{
			throw new ArithmeticException();
			
		}
		else
		{
			int c =a/b;
			System.out.println("The division of 2 number is :" + c);
		}
	}
       public static void main(String[] args) throws ArithmeticException {
    	    ThrowDemo t= new ThrowDemo();
    	    t.div(20,0);
       }
}
