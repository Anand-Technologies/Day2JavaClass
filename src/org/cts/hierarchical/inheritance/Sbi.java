package org.cts.hierarchical.inheritance;

public class Sbi extends Rbi {
	
	void accNo() {
		System.out.println("112233");
	}
	void manNo() {
		System.out.println("91919191");
	}
	public static void main (String [] args) {
		Sbi s=new Sbi();
		s.accNo();
		s.manNo();
		s.aadharCard();
		s.panCard();
	}
}
