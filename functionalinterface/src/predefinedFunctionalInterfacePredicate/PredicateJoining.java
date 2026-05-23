package predefinedFunctionalInterfacePredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Q) Print employee names who are working in Hyderabad location  and in DBA team.

class Employee{
	   public String name;
	   public int age;
	   public double salary;
	   public String location;
	   public String role;
	   
	   Employee(String name , int age , double salary , String location , String role){
		   this.name = name;
		   this.age = age;
		   this.salary = salary;
		   this.location = location;
		   this.role = role;
	   }
	   
	}


public class PredicateJoining {
	
	public static void main(String[] args) {
		
		// Creating the object of all employee
		
		Employee employee0 = new Employee("Alice",34 , 90000,"Hyderabad","DBA");
		Employee employee1 = new Employee("Bob",24 , 80000,"Chennai","SDET");
		Employee employee2 = new Employee("Charlie",37 , 70000,"Bangalore","SDE");
		Employee employee3 = new Employee("David",31 , 85000,"Hyderabad","DBA");
		Employee employee4 = new Employee("Elice",29 , 65000,"Hyderabad","SRE");
		Employee employee5 = new Employee("Flif",39 , 165000,"Hyderabad","SRE");
		
		
		//Create a List of Employee 
		
		List<Employee> empData = Arrays.asList(
				employee0 ,
				employee1 ,
				employee2 ,
				employee3 ,
				employee4 ,
				employee5
				);
		
		
		// Use Lambda Function to filter the  employee
		
	     Predicate<Employee> empLocation = emp -> {
	    	  return emp.location == "Hyderabad";
	      };
	      Predicate<Employee> empRole = emp -> {
	    	  return emp.role == "DBA";
	      };
	      
	     Predicate<Employee> empName = emp -> {
	    	 return emp.name.startsWith("A");
	     };
	      
//	      Use .and() method for use multiple lambda function at a time
	      Predicate<Employee> bothCondition = empLocation.and(empRole).and(empName);

//	      Print Employee
	      
	      System.out.println("The person who are working in Hyderabad location and in DBA team");
	  	System.out.println("====================================================================");
	  	
	  //Use forEach method to print filter Employee
	      
	      for (Employee employee : empData) {
	    	  if(bothCondition.test(employee)) {
	    		 System.out.printf(
	    				 "Name: %s ,Age: %d , Salary: %.2f , Location: %s , Role: %s%n",
	    				 employee.name,
	    				 employee.age,
	    				 employee.salary,
	    				 employee.location,
	    				 employee.role
	    				 );
	    	  }
		}
		
		
		
		
	}

}
