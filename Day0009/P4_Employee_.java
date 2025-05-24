package Day0009;
//  Implement a class `Employee` that has private fields `id`, `name`, and `salary`. Provide getter and setter methods for each and display the employee details.


class Employee{
    private int id;
    private String name;
    private int salary;

    void setvalues(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

        void getvalues(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }


}

public class P4_Employee_ {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setvalues(345, "Ham", 550000);
        e.getvalues();
        
    }
    
}
