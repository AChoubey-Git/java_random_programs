package strings_exp;

class Employee {
	 private String name;
	 private int age;
	public Employee(String name,int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee emp = (Employee) obj;
		return name.equals(emp.name)&& Integer.compare(age, emp.age) == 0;
	}
	
}

public class Check {

	public static void main(String[] args) {
		String name = "Amit";
		int age = 19;
		 Employee emp1 = new Employee(name, age);
	      Employee emp2 = new Employee(name, age);
	      boolean result = emp1.equals(emp2);
	      System.out.println(result);
	}
}