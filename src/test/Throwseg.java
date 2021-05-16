package test;

public class Throwseg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwseg obj = new Throwseg();
		try {
			obj.elegibility(18);
		
		} catch(ArithmeticException e) {
			System.out.println("Exception handled");
		}

	}
	public void elegibility(int age) throws ArithmeticException {
		if(age<18) {
			throw new ArithmeticException("not valid age");
		} else {
			System.out.println("Eligible for voting");
		}
	}

}
