package qualle.inc.alg;

import java.util.Scanner;

public class Fact {

    public static void main() {

        // Fn = Fn * Fn-1 * ... * F1
        System.out.println("Введите число <15");
        Scanner scanner = new Scanner(System.in);
        int F = scanner.nextInt();

        System.out.println(Calculated(F));
    }

    private static int Calculated(int F) {  // лучше исп long

        if (F <= 1){

            return 1;

        } else {

            F = F * Calculated(F-1);

            return F;
        }
    }
}
