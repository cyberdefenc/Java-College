package Day0004;
// P7. Create a class Employee with name, id, and salary. 
// Write a method to give a 5% salary increment. 
// Print details before and after increment.


class Employee {
    String name;
    int id;
    double salary;

    void incrementSalary() {
        salary += salary * 0.05;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        
    }
}

public class P7_employee_sal_ {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Utkarsh";
        emp.id = 1001;
        emp.salary = 45000;

        System.out.println("Before Increment:");
        emp.display();

        emp.incrementSalary();

        System.out.println("After Increment:");
        emp.display();
    }
}
