//   Single-Level Inheritance - Employee Example
//Create a class Employee with method work().
//Create a class Manager that inherits from Employee and adds method attendMeeting().
//Create an object of Manager and call both methods.

package Day5;
class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}

class Manager extends Employee {
    void attendMeeting() {
        System.out.println("Manager is attending a meeting...");
    }
}

public class P1_s_Manager_ {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.work();
        mgr.attendMeeting();
    }
}
