package qualle.inc.alg;

public class Search {

public void Binar (int[] arr, int num){

    if (num >= arr[arr.length / 2]) {

        for (int i = (arr.length / 2); i < arr.length; i++) {

            if (arr[i] == num) {
                System.out.println("Yes it is " + (i + 1));
                break;
            }
        }

    } else {

        for (int i = 0; i < arr.length / 2; i++) {  // первые 10 элементов  (до 9)

            if (arr[i] == num) {
                System.out.println("Yes it is " + (i + 1));
                break;

            }
        }
    }
}

public void Line (int[] arr, int num) {

    for (int i= 0; i < arr.length; i++){
        if (arr[i] == num) {
            int find = i + 1;
            System.out.println("Элемент № " + find);
        }
    }

}



}
