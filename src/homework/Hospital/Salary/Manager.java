package homework.Hospital.Salary;

public class Manager extends employeeInfo implements Person {

	public Manager() {
		super();

	}

	@Override
	public double getSalary() {
		return super.getSalary();
	}

	@Override
	public void setSalary(double salary) {
		super.setSalary(salary);
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
	}

	public Manager(String name, String lastName, String job, int salary) {
		super(name, lastName, job, salary);

	}

	@Override
	public void salaryRaise() {
		setSalary(getSalary() * (1.3));

	}

}
