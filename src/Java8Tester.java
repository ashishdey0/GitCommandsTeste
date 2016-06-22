interface MathOperation {
    int operate(int a, int b);
}

class Multiplier implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a*b;
    }
}

public class Java8Tester {
    public static void main(String[] args){
        System.out.println("Java8Tester Running ...");
 
    }



}
