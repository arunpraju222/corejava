package oopsconcepts;

public class ClassA {
public int Salary;
public String Name;
protected String Orgname;
public ClassA() {
System.out.println("Inside Constructor");
}
public ClassA(int val1, String val2, String val3)
{
	this.Salary= val1;
  this.Name= val2;
  this.Orgname= val3;
}
public void Display() {
System.out.println("name of emp:" +Name);
System.out.println("salary:" +Salary);
System.out.println("Orgname:" +Orgname);
}
}
