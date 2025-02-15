package com.vs.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vs.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/vs/SpringAOP/ApplicationContext.xml");
        PaymentService paymentobj= context.getBean("payment",PaymentService.class);

        //auth,Payment Started
        paymentobj.makePayment(123);
    }
}
