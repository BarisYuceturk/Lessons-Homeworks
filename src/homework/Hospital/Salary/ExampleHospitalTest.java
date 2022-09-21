package homework.Hospital.Salary;

import java.util.ArrayList;
import java.util.List;

public class ExampleHospitalTest {
	public static void main(String[] args) {

		List<Person> employeeList = new ArrayList<>();

		employeeList.add(new Doctor("Gregory", "House", "Doctor", 16000));
		employeeList.add(new Doctor("Fatih", "Tekke", "Doctor", 14000));
		employeeList.add(new Manager("Bedri", "Baykam", "Manager", 12000));
		employeeList.add(new Manager("Sena", "Sırt", "Manager", 10000));
		employeeList.add(new Nurse("Nurse", "Birsel", "Nurse", 8000));
		employeeList.add(new Nurse("Hem", "Şire", "Nurse", 8000));
		employeeList.add(new Janitor("Hasan", "Terim", "Janitor", 6500));
		employeeList.add(new Janitor("Hasan", "Terim2", "Janitor", 6500));

		employeeList.stream().forEach(traveler -> System.out.println(traveler));

		System.out.println("-----------");

		List<Person> managerList = employeeList.subList(2, 4);
		managerList.stream().forEach(traveler -> System.out.println(traveler));

		employeeList.stream().forEach(t -> t.salaryRaise());
		managerList.stream().forEach(t -> t.salaryRaise());
		
		System.out.println("\n\n----------- zamdan sonra --------");
		employeeList.stream().forEach(traveler -> System.out.println(traveler));
		System.out.println("----------- zamdan sonra --------");
		managerList.stream().forEach(traveler -> System.out.println(traveler));
	}
}
