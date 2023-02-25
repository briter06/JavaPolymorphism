package operatorService.operators;

import operatorService.factory.IOperator;
import operatorService.factory.Operators;

public class Minus implements IOperator{
	
	Operators operationId;
	
	public Minus(){
		this.operationId = Operators.SUM;
	}

	public Operators getOperationId() {
		return this.operationId;
	}

	public double validate(double a, double b) {
		double result = a - b;
		return result;
	}

}
