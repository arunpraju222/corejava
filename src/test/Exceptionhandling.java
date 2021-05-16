package test;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b= 0;
		try {
			int result = a/b;
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
			System.out.println("Hello");
		}
catch(Exception e) {
	System.out.println("Exception handled");
} finally {
	System.out.println("try catch executed successfully");
}
	//	System.out.println("after error");
//	System.out.println("hello");
		int myarray [] = {2,3,45,6,7};
		try{
			System.out.println("Third value in Array" +myarray[6]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("AOB Exception Handles");
			}
		}

}
