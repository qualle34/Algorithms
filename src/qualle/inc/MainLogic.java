package qualle.inc;

import java.util.Random;

class MainLogic {

    private int[] array;
    private Random random = new Random();

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

        for (int anArr : arr) {

            strArr += Integer.toString(anArr) + "\n";
        }

        return strArr;
    }

}