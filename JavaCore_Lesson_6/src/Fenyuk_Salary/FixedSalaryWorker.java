package Fenyuk_Salary;

public class FixedSalaryWorker extends Worker implements Salary {
	
	private double monthRate;

	public FixedSalaryWorker(String name, double monthRate) {
		super(name);
		this.monthRate = monthRate;
	}

	public double getMonthRate() {
		return monthRate;
	}

	public void setMonthRate(double monthRate) {
		this.monthRate = monthRate;
	}
	

	@Override
	public void salary() {
		double salary = this.monthRate;
		System.out.println("Зарплата працівника " + super.getName() + " склала " + salary + " грн.");		
	}




	
	

}
