package operatorService.factory;

import operatorService.operators.Minus;
import operatorService.operators.Sum;

public class OperatorFactory {

	public static IOperator get(Operators operatorId) {
		switch(operatorId) {
			case SUM:
				return new Sum();
			case MINUS:
				return new Minus();
			default:
				throw new RuntimeException("Invalid operator");
		}
	}
	
}
