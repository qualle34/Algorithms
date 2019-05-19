package qualle.inc.alg;

public class Fibonacci {

    public static int FibonacciCalc(int F) {

        if (F == 0) {

            return 0;

        }
        if (F == 1) {

            return 1;

        } else {

            return FibonacciCalc(F - 1) + FibonacciCalc(F - 2);

        }
    }
}
