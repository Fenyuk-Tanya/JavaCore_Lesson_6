package Fenyuk_Salary;

public class Application {

	public static void main(String[] args) {
	
		FixedSalaryWorker fsw = new FixedSalaryWorker("Петро", 7500); 
		HourlyWageWorker hww = new HourlyWageWorker("Іван", 170, 45.35);
		
		fsw.salary();
		hww.salary(); 

	}

}
