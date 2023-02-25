package main;

import operatorService.factory.IOperator;
import operatorService.factory.OperatorFactory;
import operatorService.factory.Operators;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		IOperator operator;
			
		Scanner sc = new Scanner(System.in);
		boolean flagContinue = true;
		while(flagContinue) {
			System.out.println("Select an operator:");
			List<Operators> operators = Arrays.asList(Operators.values());
			int i;
			for(i = 0; i<operators.size(); i++) {
				System.out.println(String.format("%s. %s",i+1, operators.get(i)));
			}
			System.out.println(String.format("%s. EXIT", i+1));
			System.out.println("Write the operator:");
			String operatorId = sc.nextLine();
			if(operatorId.equals("EXIT")) {
				flagContinue = false;
			}else {
				operator = OperatorFactory.get(Operators.valueOf(operatorId));
				System.out.println("Insert first value:");
				double a = Double.parseDouble(sc.nextLine());
				System.out.println("Insert second value:");
				double b = Double.parseDouble(sc.nextLine());
				System.out.println(String.format("Result: %s", operator.validate(a, b)));
				System.out.println("===================================================");
			}
		}
		System.out.println("Thank you!!");
		sc.close();
		
	}

}
