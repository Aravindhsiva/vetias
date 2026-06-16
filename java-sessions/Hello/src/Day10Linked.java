import java.util.ArrayList;
import java.util.LinkedList;

public class Day10Linked {

    static void process(LinkedList<String> list){
        System.out.println("Removed : "+list.removeFirst());
    }
    static void main() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        // System.out.println(list.poll());
        // System.out.println(list.reversed());
        /*System.out.println(list.indexOf("C"));
        list.set(list.indexOf("C"), "Z");
        for(String s: list) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println(list.contains("H"));
        System.out.println("------------");
        for(String s: list) {
            System.out.println(s);
        }*/

        while(list.size()>1){
            process(list);
        }
    }
}
