package com.vs.SpringAOP2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vs.services.PaymentService;

public class App
{
    public static void main(String[] args)
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
       PaymentService psiobjImpl = context.getBean(PaymentService.class);
       psiobjImpl.makePayment(500);
    }
}
