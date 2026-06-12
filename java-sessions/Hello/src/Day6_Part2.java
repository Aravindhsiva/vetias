public class Day6_Part2 {
    /*static class Employee {
        int balance;
        int salary;
        Employee(int balance, int salary){
            this.balance=balance;
            this.salary=salary;
        }

        //getter
        public int getBalance() {
            return balance;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }

    static void main() {
        Employee e = new Employee(0,20000);
        e.balance=20000;
        e.getSalary();
        //e.setBalance(30000);

    }


     */

    static class Market {
        void load(String vegetable){
            System.out.println("Loading the "+vegetable+"...");
        }
        void load(String vegetable, int kgs){
            System.out.println("Loading "+kgs+"kgs of Veg: "+vegetable);
        }
    }

    static void main() {
        Market market = new Market();
        market.load("Tomato");
        market.load("Onion", 500);
    }
}
