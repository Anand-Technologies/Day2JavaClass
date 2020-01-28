package org.cts.hierarchical.inheritance;

public class Icici extends Rbi{
	
	public void accNo() {
		System.out.println("445566");
	}
	public void manNo() {
		System.out.println("9876546754");
	}
	
	public static void main (String [] args) {
		Icici i= new Icici();
		i.accNo();
		i.manNo();
		i.aadharCard();
		i.panCard();
	}
}
