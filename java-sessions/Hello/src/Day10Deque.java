import java.util.ArrayDeque;

public class Day10Deque {

    static void takeOut(ArrayDeque<String> bucket){
        String plate = bucket.pollLast();
        System.out.println("Taking out Plate :"+plate);
    }

    static void main() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offer("P1");
        deque.offer("P2");
        deque.offer("P3");
        deque.offer("P4");

        System.out.println(deque);

        while(deque.size()>0){
            takeOut(deque);
        }
      }
}
