package io;


interface PaymentService{
void makePayment();
}

class DebitCard {

	void makePayementsUsingDebit()
	{
		System.out.println("Making Payment using Debit Card");
	}
	
 class MethodReference{
	public static void main(String[] args) {
		
		DebitCard dc = new DebitCard();
		PaymentService ps=dc::makePayementsUsingDebit;
		PaymentService ps1 = ()-> System.out.println("Making Payement using Debit Card");
		
		ps.makePayment();
		ps1.makePayment();
	}
	
	}
}
