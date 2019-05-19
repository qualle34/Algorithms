package qualle.inc.alg;

import java.util.Scanner;

public class LineF {

    public static void main() {

Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String result = "";

        Flip(s, result);
    }

    private static void Flip(String original, String result){

        for (int i = original.length() - 1; i >= 0; i--)
        {
            result = result + original.substring(i, i+1);
        }

        System.out.println(result);
    }
}
