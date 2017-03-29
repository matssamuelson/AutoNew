import java.util.Scanner;


/**
 * Created by Svala on 2017-02-22.
 */
public class Interface {

    public static  void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        String operation;
        Calculator calc = new Calculator();


        Scanner op = new Scanner(System.in);
        System.out.println("Enter Operation");
        operation = op.next();

        if (operation.equals("sqrt")) {
            System.out.println("Enter first number: ");
            firstNumber = input.nextInt();
            System.out.println("Your answer is " + calc.SquareRoot(firstNumber));
            return;
        }

        System.out.println("Enter first number: ");
        firstNumber = input.nextInt();

        System.out.println("Enter Second number: ");
        secondNumber = input.nextInt();


        if (operation.equals("+")) {
            System.out.println("Your answer is " + calc.Add(firstNumber, secondNumber));

        }
       else if (operation.equals("-")) {
            System.out.println("Your answer is " + calc.Subtract(firstNumber, secondNumber));

        }
       else if (operation.equals("*")) {
            System.out.println("Your answer is " + calc.Multiply(firstNumber, secondNumber));

        }
       else if (operation.equals("/")) {
            System.out.println("Your answer is " + calc.Divide(firstNumber, secondNumber));

        }

        else if (operation.equals("^")) {
            System.out.println("Your answer is " + calc.PowerIn(firstNumber, secondNumber));
        }

        else if (operation.equals("%")) {
            System.out.println("Your answer is " + calc.Modulus(firstNumber, secondNumber));

        }

        else {
            System.out.println("Don't know");
        }

    }


}
