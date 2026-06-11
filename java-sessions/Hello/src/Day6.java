public class Day6 {
    static class Employee {
        String name;
        int salary;
        String id;
        int balance;
        // default constructor
        Employee(){
            System.out.println("Constructor called");
        }
        //Employee(String name, int salary){
          //  this.name=name;
            //this.salary=salary;
        //}
        Employee(String name, int salary, String id){
            this.name=name;
            this.salary=salary;
            this.id=id;
        }

        // It'll handle payments
        // It'll take salary and put it in  balance
        void payEmployee(int salary){
            balance+=salary;
            this.salary=salary;
        }
        void expense(int expense){
            balance-=expense;
        }

        void showBalance(){
            System.out.println("Your balance is : "+balance);
        }

        void printDetails(){
            System.out.println("ID: "+id);
            System.out.println("Name: "+name);
            System.out.println("Salary: "+salary);
        }
    }
    public static void main(String[] args) {
           Employee employee = new Employee("Aravindh",0,"12321");
           /*employee.name = "John";
           employee.printDetails();
           Employee employee2 = new Employee("Aravindh",50000,"12321");
           employee2.printDetails();
           */

        employee.payEmployee(50000);
        employee.printDetails();
        employee.showBalance();
        employee.expense(10000);
        employee.showBalance();
    }
}
