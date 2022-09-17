package javaapplication19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Employee1 {


    public static void main(String[] args) {
    class Employee implements Comparable<Employee> {
	    String name;
	    Integer age;
	    Integer salary;
	    Integer EmployeeId;	
          
	

	public Employee(String n, int a,int b, int id) {
	       name = n;
	       age =a;
	       salary = b;
	       EmployeeId =id;
	       
	}


	public int compareTo(Employee o)
        {
          return this.name.compareTo(o.name) + (this.age.compareTo(o.age)) +(this.salary.compareTo(o.salary))
	                    + (this.EmployeeId.compareTo(o.EmployeeId));
	}

		public static void main(String[] args) 
                {
			 Employee emp1 = new Employee("krishna", 65, 5000 ,3302);
			 Employee emp2 = new Employee("anuj", 76, 2000 ,2001);
			 Employee emp3 = new Employee("ravi", 95, 3000 ,2351);
			 Employee emp4 = new Employee("anand", 95, 6000 ,5003);
			 Employee emp5 = new Employee("rahul", 70, 8000 ,2003);

  List<Employee> l = new ArrayList<Employee>();
   l.add(emp1);
   l.add(emp2);
   l.add(emp3);
   l.add(emp4);
   l.add(emp5);
  Collections.sort(l); // sorting
  System.out.println(l); // Display array list
    }
   }
}
}


  
    

