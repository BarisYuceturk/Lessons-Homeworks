package homework.Hospital.Salary;

public class Janitor extends employeeInfo implements Person {

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
		return "Janitor [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
	}

	@Override
	public void salaryRaise() {
		setSalary(getSalary() * (1.101));

	}

	public Janitor() {
		super();

	}

	public Janitor(String name, String lastName, String job, int salary) {
		super(name, lastName, job, salary);

	}
}
