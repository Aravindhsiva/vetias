public class Day8 {
/*
    record StudentRecord(int balance, int salary){

    }

    static void main() {
        StudentRecord studentRecord = new StudentRecord(0, 50000);
        System.out.println(studentRecord.balance());
        System.out.println(studentRecord.salary());
    }
    */

    enum DEPARTMENT{
        CS("Computer Science"),
        CSA("Computer Science and Application"),
        CT("Computer Technology"),
        AIDS("Artificial Intelligence and Data Science"),
        IT("Information Technology");

        String description;

        DEPARTMENT(String description){
            this.description = description;
        }
    }

    static void main() {
        System.out.println(DEPARTMENT.CSA.description);
    }
}
