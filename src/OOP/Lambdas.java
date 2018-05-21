package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;



public class Lambdas {
    public static void main(String[] args) {
        //new Thread(new CodeToRun()).start();
        // new Thread(new Runnable(){
        //     @Override
        //     public void run(){
        //         System.out.println("Printing from the runnable"); 
        //      }
        // }).start();
        new Thread(()->System.out.println("It is a lambda expression")).start();
//        new Thread(
//            ()->{
//            System.out.println("It is a lambda expression");
//            System.out.println("Is is a lambda expression with multiple statements");
//        }).start();
        
        Employee ahmed = new Employee("Ahmed", 22);
        Employee haris = new Employee("Haris", 24);
        Employee mirza = new Employee("Mirza", 23);

        List<Employee> employees = new ArrayList<>();
        employees.add(ahmed);
        employees.add(mirza);
        employees.add(haris);
        
        int[] mapToInt = employees.stream().mapToInt(Employee::getAge).toArray();
        
        Collections.sort(employees, (e1,e2) -> e1.getName().compareTo(e2.getName()));
        
//        Collections.sort(employees, new Comparator<Employee>(){
//            @Override
//            public int compare(Employee employee1,Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        for (int age : mapToInt) {
            System.out.println(age);
        }
        
        for (Employee employee:employees ){
        	System.out.println(employee.getName());
        }

        

        
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(){
    }

    public Employee(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
    }
    
    public int sum(int a, int b) {
        return a+b;
    }
    

}
