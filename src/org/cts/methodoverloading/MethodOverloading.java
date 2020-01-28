package org.cts.methodoverloading;

public class MethodOverloading {
	public void empId(String name) {
		System.out.println(name);
	}
	public void empId(String name,long phnno,char block) {
		System.out.println(name+ "\n" +phnno+ "\n" +block);
	}
	//Data type
	public void empId(int regno) {
		System.out.println(regno);
	}
	public void empId(boolean perEmp) {
		System.out.println(perEmp);
	}
	//Datatype Order
	public void empId(String manager, String project) {
		System.out.println(manager+"\n"+project);
	}
	public void empId(float sal, String date) {
		System.out.println(sal+"\n"+date);
	}
		public static void main (String [] args) {
			MethodOverloading ml=new MethodOverloading();
			ml.empId("Anand");
			ml.empId("Anand", 9940015190l, 'X');
			ml.empId(12345.67f, "12/11/1994");
			ml.empId("Mark Antony", "Air Canada");
			ml.empId(333);
			ml.empId(true);
		}
}
