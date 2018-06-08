import java.io.Serializable;

public class Calculator implements Serializable, Equals {
	private static final long serialVersionUID = 1L;
	private double input1;
	private double input2;
	private String operation;
	public Calculator() {
		this.input1 = 0;
		this.input2 = 1;
		this.operation = "+";
	}
	public Calculator(double input1, double input2, String op) {
		this.input1 = input1;
		this.input2 = input2;
		this.operation = op; //will force anything other than (-, *, /) to be +
	}
	public double performOperation() {
		if (this.operation == "-") {
			return (this.getFirstInput() - this.getSecondInput());
		}
		else if(this.operation == "*") {
			return (this.getFirstInput() * this.getSecondInput());
		}
		else if(this.operation == "/") {
			return (this.getFirstInput() / this.getSecondInput());
		}
		else { //addition is default
			this.operation = "+"; //sets the string in case of bad entry
			return (this.getFirstInput() + this.getSecondInput());
		}
	}
	public double getResults() {
		double result = this.performOperation();
		System.out.print("Your desired operation was: ");
		System.out.print(this.getFirstInput());
		System.out.print(this.getOperation());
		System.out.println(this.getSecondInput());
		System.out.print("Your result is: ");
		System.out.println(result);
		return result;
	}
	//getters and setters
	public double getFirstInput() {
		return this.input1;
	}
	public double getSecondInput() {
		return this.input2;
	}
	public String getOperation() {
		return this.operation;
	}
	public void firstInput(double input) {
		this.input1 = input;
	}
	public void secondInput(double input) {
		this.input2 = input;
	}
	public void operation(String newOp) {
		this.operation = newOp;
	}
}