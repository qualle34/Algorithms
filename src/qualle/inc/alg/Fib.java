package qualle.inc.alg;

import java.util.Scanner;

public class Fib {

    public static void main() {

        // Fn = Fn-1 + Fn-2

        // F3 = F2 + F1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи F");
        System.out.println(Calculation(scanner.nextInt()));

    }

    private static int Calculation(int F) {

        if (F == 0) {

            return 0;

        } if (F == 1) {

            return 1;

        } else {

            return  Calculation(F-1) + Calculation(F-2);

        }
    }
}
