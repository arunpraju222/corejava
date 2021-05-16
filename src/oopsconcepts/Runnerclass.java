package oopsconcepts;

public class Runnerclass {

	private static final String Abc = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ClassA Emp1 = new ClassA(1000, "sujith","sree");
ClassA Emp2 = new ClassA();
Emp1.Display();
ClassB Obj1= new ClassB();
Obj1.Name = "Raj";
Obj1.Salary= 1000;
Obj1.Orgname = "pqr";
Obj1.Display();
Obj1.show();
Classc Obj2 = new Classc();
Obj2.run();
		MethodOverloading Obj3 = new MethodOverloading();
		Obj3.add(1,2);
		Obj3.add(1.1,7.2);
		
		MethodOverridechild Obj4 = new MethodOverridechild();
		Obj4.display();
		AbstractionChild Obj5 = new AbstractionChild();
		Obj5.method1();
		Obj5.method2();*/
		Interfacechild Obj6 = new Interfacechild();
		Obj6.method1();
		Encapsulationeg obj7 = new Encapsulationeg();
		obj7.setSalary(10000);
		System.out.println(obj7.getSalary());
		
	}

	
}
