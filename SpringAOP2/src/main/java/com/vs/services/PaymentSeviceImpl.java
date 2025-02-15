package com.vs.services;

import org.springframework.stereotype.Component;

@Component
public class PaymentSeviceImpl implements PaymentService{

	@Override
	public void makePayment(int amount) {

		System.out.println(amount+"Amount Debited..");
		System.out.println(amount+"Amount credited..");


	}



}
