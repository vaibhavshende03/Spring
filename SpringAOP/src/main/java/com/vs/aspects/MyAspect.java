package com.vs.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

//	@Before("execution(* com.vs.services.PaymentServiceImpl.makePayment())")
	@Before("execution(* com.vs.services.PaymentServiceImpl.makePayment(..))")
	public void printBefore() {
		System.out.println("Payment Started..");
	}
	
//	@After("execution(* com.vs.services.PaymentServiceImpl.makePayment())")
	
	@After("execution(* com.vs.services.PaymentServiceImpl.makePayment(..))")
	public void printAfter() {
		System.out.println("Payment Done..");
	}
}
