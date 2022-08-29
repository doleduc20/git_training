package IEmployee;

public class PartTimeEmployee extends Employee {
	private int workingHours;
	
	public PartTimeEmployee(String name,int paymentPerHours,int workingHours) {
		super(name,paymentPerHours);
		this.workingHours = workingHours;
	}
	
	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public int calculateSalary() {
		return workingHours * getPaymentPerHour();
	}
}
