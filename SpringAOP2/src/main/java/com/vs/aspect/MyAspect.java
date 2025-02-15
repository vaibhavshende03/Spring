package com.vs.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Before("execution(* com.vs.services.PaymetServiceImpl.makePayment(..))")
	public void printBefore() {

		System.out.println("Payment Starting");
	}

	@After("execution(* com.vs.services.PaymetServiceImpl.makePayment(..))")

public void printAfer() {

		System.out.println("Payment Done");
	}


}