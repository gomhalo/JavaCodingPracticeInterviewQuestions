package CodingPracticeInterviewQuestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> names = printNmaes();
		
//		for(String name: names) {
//			System.out.print(name+",");
//		}
		

	}
	
	public static List<String> printNmaes(){
		List<Employee> employees=new ArrayList<>();
		
		Employee emp1= new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("Amanuel");
		emp1.setEmpAge(40);
		Employee emp2= new Employee();
		emp2.setEmpId(2);
		emp2.setEmpName("Asmeret");
		emp2.setEmpAge(38);
		Employee emp3= new Employee();
		emp3.setEmpId(3);
		emp3.setEmpName("Kisanet");
		emp3.setEmpAge(25);
		Employee emp4= new Employee();
		emp4.setEmpId(4);
		emp4.setEmpName("Eden");
		emp4.setEmpAge(34);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		List<String> names = employees.stream().map(Employee::getEmpName).collect(Collectors.toList());
		
	employees.stream().map(Employee::getEmpName).collect(Collectors.toList()).forEach(System.out::println);
employees.stream().map(Employee::getEmpAge).collect(Collectors.toList()).forEach(System.out::println);
		
		String name = Optional.ofNullable(emp1.getEmpName()).orElseThrow(()->new IllegalArgumentException("The id is not correct please use another ID"));
		
	
	
	System.out.println("-----------------------------------------------");
	Map<Integer,List<Employee>> listEmploye = employees.stream().collect(Collectors.groupingBy(emp->emp.getEmpAge()));
	listEmploye.values().stream().flatMap(Collection::stream).forEach(emp->System.out.println(emp.getEmpName()));
		
		return names;
			
		
	}

}


