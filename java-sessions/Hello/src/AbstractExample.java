public class AbstractExample {

    static abstract class Parent {
        private String name;

        void print(){
            System.out.println("Hello from parent");
        }
        abstract void action();
    }

    static class ChildOne extends Parent{

        @Override
        void action(){
            System.out.println("ChildOne action");
        }
    }

    static class ChildTwo extends Parent{

        @Override
        void action(){
            System.out.println("ChildTwo action");
        }
    }

    static void main() {
        ChildOne childOne = new ChildOne();
        childOne.action();

        ChildTwo childTwo = new ChildTwo();
        childTwo.action();
    }
}
