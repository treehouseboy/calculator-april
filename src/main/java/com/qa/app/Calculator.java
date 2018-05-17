package com.qa.app;

import java.util.HashMap;

import com.qa.mathoperations.Adder;
import com.qa.mathoperations.Calculation;
import com.qa.mathoperations.Divider;
import com.qa.mathoperations.Multiplier;
import com.qa.mathoperations.Subtractor;

public class Calculator {
	
	private int result;
	
	private HashMap<String, Calculation> calcMap = new HashMap<String, Calculation>();
	
	
	public Calculator(String operation, int num1, int num2){
		this.result = 0;
		this.calcMap.put("add", new Adder());
		this.calcMap.put("subtract", new Subtractor());
		this.calcMap.put("divide", new Divider());
		this.calcMap.put("multiply", new Multiplier());
		this.Calculate(operation, num1, num2);
	}
	
	public void Calculate(String response, int num1, int num2) {
		
		switch(response) {
		case "add":
			this.result = calcMap.get(response).doCalculation(num1, num2) ;
			break;
		case "subtract":
			this.result = calcMap.get(response).doCalculation(num1, num2);
			break;
		case "divide":
			this.result = calcMap.get(response).doCalculation(num1, num2);
			break;
		case "multiply":
			this.result = calcMap.get(response).doCalculation(num1, num2);
			break;
		}
		System.out.println("The result of " + num1 + " " + response + " " + num2 + " is " + result);
	}

}
