package qualle.inc.alg;

public class Search {

    public boolean BinarS(int[] arr, int num) {

        if (num >= arr[arr.length / 2]) {

            for (int i = (arr.length / 2); i < arr.length; i++) {

                if (arr[i] == num) {
                    return true;
                }
            }

        } else {

            for (int i = 0; i < arr.length / 2; i++) {

                if (arr[i] == num) {
                    return true;

                }
            }
        }
        return false;
    }

    public boolean LineS(int[] arr, int num) {

        for (int anArr : arr) {
            if (anArr == num) {
                return true;
            }
        }
        return false;
    }
}
