package Fenyuk_interface2;

public class MyCalculator implements Fenyuk_interface1.Numerable {
	
	double a;
	double b;
	
	public MyCalculator() {
	}

	public MyCalculator(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double plus() {
		return this.a+this.b;
	}

	@Override
	public double minus() {
		return this.a-this.b;
	}

	@Override
	public double multiply() {
		return this.a*this.b;
	}

	@Override
	public double devide() {
		return this.a/this.b;
	}
	
	static void viewCalcResult(double result) {
		System.out.println("Результат операції дорівнює " + result);
	}
	
	

}
