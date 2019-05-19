package qualle.inc.alg;

public class Factorial {

    public long FactorialCalc(long F) {

        if (F <= 1) {

            return 1;

        } else {

            F = F * FactorialCalc(F - 1);

            return F;
        }
    }
}
