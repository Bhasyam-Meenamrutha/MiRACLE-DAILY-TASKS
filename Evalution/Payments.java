package Evalution;

abstract class PaymentGateway{
	abstract void payment();
}

class UPI extends PaymentGateway{
	void payment() {
		System.out.println("UPI Method Of payment");
	}
}

class CreditCard extends PaymentGateway{
	void payment() {
		System.out.println("CreditCard Method Of payment");
	}
}
class DebitCard extends PaymentGateway{
	void payment() {
		System.out.println("DebitCard Method Of payment");
	}
}

public class Payments {
	public static void main(String[] args) {
		UPI p1=new UPI();
		CreditCard p2=new CreditCard();
		DebitCard p3=new DebitCard();
		
		p1.payment();
		p2.payment();
		p3.payment();

		
	}
}
