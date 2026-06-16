import java.util.ArrayList;

public class Day10 {
    static void main() {
        /*String[] alpha = {"A","B","C","D"};

        System.out.println(alpha.length);

        ArrayList<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for(String s: list) {
            System.out.print(s);
        }
        list.add("E");

        list.remove("C");
        System.out.println();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println();
        for(String s: list) {
            System.out.print(s);
        }
        System.out.println();
        System.out.println(list.get(2));
        list.addAll(list);

        System.out.println();

        for(String s: list) {
            System.out.print(s);
        }
        */

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("John");
        studentList.add("Jane");
        studentList.add("Julie");
        studentList.add("Jenn");
        studentList.add("Ram");
        studentList.remove("Ram");
        for (String student: studentList) {
            System.out.println(student);
        }
        int found=-1;
        String searchName = "Julie";
        for(int index = 0; index < studentList.size(); index++){
            if(studentList.get(index).equals(searchName)){
                found=index;
            }
        }
        studentList.set(found, "Mike");
        System.out.println("-----------------");
        for (String student: studentList) {
            System.out.println(student);
        }

    }

}
