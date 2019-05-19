package qualle.inc.alg;

public class LineFlip {

    public String Flip(String original) {
        String result = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            result = result + original.substring(i, i + 1);
        }

        return result;
    }
}
