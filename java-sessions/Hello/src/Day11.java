import java.util.*;

public class Day11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Student1");
        list.add("Student2");
        list.add("Student1");
        list.add("Student1");
        list.add("Student2");
        for (String s : list) {
            //System.out.println(s);
        }
        Set<String> set = new HashSet<>();
        set.addAll(list);
        //System.out.println("Set : ");
        for (String s : set) {
            //System.out.println(s);
        }

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Maths");
        sortedSet.add("Physics");
        sortedSet.add("Chemistry");
        sortedSet.add("Maths");
        sortedSet.add("Physics");
        sortedSet.add("Physics");
        sortedSet.add("Chemistry");
        for (String s : sortedSet) {
            //System.out.println(s);
        }
        SortedSet<Integer> marks = new TreeSet<>();
        marks.add(78);
        marks.add(78);
        marks.add(34);
        marks.add(66);
        marks.add(100);
        for (Integer i : marks) {
            //System.out.println(i);
        }

        //Interface<returnName> instanceName = new ClassName();

        Map<String, Object> person = new HashMap<>();
        person.put("name", "Aravindh");
        person.put("age", 18);
        person.put("isOld", false);
        person.put("percent", 67.677);

        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }

}
