package com.pad.test;

import org.springframework.aop.framework.ProxyFactory;

import com.pad.advise.AroundAdvise;
import com.pad.beans.Caluculator;

public class CaluculatorTest {
	public static void main(String[] args) {

		ProxyFactory factory=new ProxyFactory();
		
		factory.addAdvice(new AroundAdvise());
		factory.setTarget(new Caluculator());
		Caluculator caluculator=(Caluculator) factory.getProxy();
		int sum=caluculator.add(10, 20);
		System.out.println("Sum :"+sum);
		
		
	}
}
