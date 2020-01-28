package org.cts.methodoverriding;

public class GreensBank extends IciciBank {
	public void deposit(int id) {
		System.out.println("5% Interest" + id);
	}
	public void fixed() {
		System.out.println("9% Interest");
	}
		public static void main (String [] args) {
			GreensBank gb=new GreensBank();
			gb.saving();
			gb.deposit(99);
			gb.fixed();
		}
}
