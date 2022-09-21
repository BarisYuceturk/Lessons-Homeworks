package homework.Hospital.Salary;

public class employeeInfo {

	public String name;
	public String lastName;
	public String job;
	public double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public employeeInfo(String name, String lastName, String job, double salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.job = job;
		this.salary = salary;
	}

	public employeeInfo() {
		super();
	}

	@Override
	public String toString() {
		return "employeeInfo [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
	}
}
