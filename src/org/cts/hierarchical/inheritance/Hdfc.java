package org.cts.hierarchical.inheritance;

public class Hdfc extends Rbi {
	public void accNo() {
		System.out.println("223344");
	}
	public void manNo() {
		System.out.println("9876987678");
	}
	
	public static void main (String [] args) {
		Hdfc h=new Hdfc();
		h.accNo();
		h.manNo();
		h.aadharCard();
		h.panCard();
	}

}
