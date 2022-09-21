package homework.Hospital.Salary;

public class Nurse extends employeeInfo implements Person {

	@Override
	public String toString() {
		return "Nurse [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
	}

	@Override
	public void salaryRaise() {
		setSalary(getSalary() * (1.2));

	}

	@Override
	public double getSalary() {
		return super.getSalary();
	}

	@Override
	public void setSalary(double salary) {
		super.setSalary(salary);
	}

	public Nurse() {
		super();
	}

	public Nurse(String name, String lastName, String job, int salary) {
		super(name, lastName, job, salary);
	}
}
