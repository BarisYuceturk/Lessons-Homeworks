package homework.Hospital.Salary;

public class Doctor extends employeeInfo implements Person {

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
	}

	@Override
	public double getSalary() {

		return super.getSalary();
	}

	@Override
	public void setSalary(double salary) {

		super.setSalary(salary);
	}

	public Doctor() {
		super();

	}

	public Doctor(String name, String lastName, String job, int salary) {
		super(name, lastName, job, salary);

	}

	@Override
	public void salaryRaise() {
		setSalary(getSalary() * (1.4));

	}

}
