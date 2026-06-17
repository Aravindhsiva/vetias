public class Day_10_Ex2 {

    static int calculate(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return a/b;
    }

    static void main() {
        calculate(4,0);
    }
}
