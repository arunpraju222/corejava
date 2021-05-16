package test;

public class Throweg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int age = 19;
			if(age<18) {
				throw new ArithmeticException("not valid age");
			}else {
				System.out.println("Eligible for voting");
			}
		} catch(ArithmeticException e) {
			System.out.println("Exception Handled");
		}
	}

}
