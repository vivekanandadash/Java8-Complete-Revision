package functionalInterface;

@FunctionalInterface
interface Salary{
    double getSalary(EmpData emp);
    
}

public class EmpSalary {
	public static void main(String[] args) {
		EmpData ed = new EmpData("Vivekananda Dash", 24,70000);
		System.out.println(ed.getSalary());
		
//		Salary sal = (emp)-> emp.getSalary();
//		double newSalary = sal.getSalary(ed);
//	    System.out.println("New message :"+ newSalary);
//	
		
		Salary calc = (emp)->emp.getSalary();
		System.out.println("Salary fetched via lambda function:"+calc.getSalary(ed));
		
	}

}
