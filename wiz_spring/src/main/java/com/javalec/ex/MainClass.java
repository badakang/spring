package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculation calculation = new Calculation();
//		calculation.setFirstNum(10);
//		calculation.setSecondNum(2);
//		
//		calculation.addition();
//		calculation.subtraction();
//		calculation.multiplication();
//		calculation.division();
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator calculation = ctx.getBean("myCalculator", MyCalculator.class);
		ctx.close();
		
		calculation.add();
		calculation.sub();
		calculation.mul();
		calculation.div();
	}

 
}
