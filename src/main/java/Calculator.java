/**
 * Created by Svala on 2017-02-22.
 */
public class Calculator {

    public  int Add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int Subtract(int a, int b) {
        int sum = a - b;
        return sum;
    }
    public int Multiply(int a, int b) {
        int sum = a * b;
        return sum;
    }
    public int Divide(int a, int b) {
        int sum = a / b;
        return sum;
    }

    public int Modulus(int a, int b) {
        int sum = a % b;
        return sum;
    }
    public int SquareRoot(double sqrt) {
        sqrt =  Math.sqrt(sqrt);
        return (int) sqrt;
    }


    public int PowerIn(double a, double b) {
        double sum = Math.pow(a, b);
        return (int) sum;
    }

}
