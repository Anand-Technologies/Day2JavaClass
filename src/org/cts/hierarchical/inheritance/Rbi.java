package org.cts.hierarchical.inheritance;

public class Rbi {
	
	public void aadharCard() {
		System.out.println("Aadhar no : 123456789");
	}
	public void panCard() {
		System.out.println("Pan No : 987654321");
	}
	
	public static void main (String [] args) {
		Rbi r= new Rbi();
		r.aadharCard();
		r.panCard();
	}

}
