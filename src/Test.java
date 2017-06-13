import java.util.HashSet;
import java.util.Set;

import com.demo.seialize.Employee;


public class Test {
public static void main(String[] args) {
	Set<Employee> employeeSet=new HashSet<>();
	Employee e1=new Employee(1, "ashok");
	Employee e2=new Employee(1, "ashok");
	Employee e3=new Employee(1, "ashok");
	Employee e4=new Employee(1, "ashok");
	Employee e5=new Employee(1, "ashok");
	employeeSet.add(e1);
	employeeSet.add(e2);
	employeeSet.add(e3);
	employeeSet.add(e4);
	employeeSet.add(e5);
	System.out.println(employeeSet);
}
}
