package Day0006;
// Design a program with a base class Employee having a method calculateSalary and a subclass Manager overriding this method.

class Employee{
    double basicSalary;
    Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        System.out.println("Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(double basicSalary, double bonus) {
        super(basicSalary);  //super is a keyword in Java used to refer to the parent (superclass) of the current object.
        this.bonus = bonus;
    }

    @Override
    void calculateSalary() {
        System.out.println("Salary with bonus: " + (basicSalary + bonus));
    }
}

public class P11_Employee_ {

    public static void main(String[] args) {
            Manager m = new Manager(50000,10000);
            m.calculateSalary();
    }

    
}
