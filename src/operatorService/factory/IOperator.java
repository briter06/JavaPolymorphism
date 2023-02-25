package operatorService.factory;

public interface IOperator {
	
	Operators getOperationId();
	
	double validate(double a, double b);
	
}
