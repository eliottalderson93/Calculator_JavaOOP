
public class run {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator(24.7,13,"*");
		c2.getResults();
		c1.firstInput(5);
		c1.secondInput(7);
		c1.operation("+");
		c1.getResults();

	}

}
