package qualle.inc;

import qualle.inc.alg.Sort;
import java.util.Random;

class MainLogic {

    private int[] array;
    private Random random = new Random();
    private Sort sort = new Sort();

    void setArray(int length) {

        this.array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    int[] getArray() {
        return array;
    }

    String getArrayInStr(int[] arr) {

        String strArr = "";

        for (int i = 0; i < arr.length; i++) {

            strArr += Integer.toString(arr[i]) + "\n";
        }

        return strArr;
    }

}