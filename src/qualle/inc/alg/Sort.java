package qualle.inc.alg;

public class Sort {

    public int[] BubbleS(int[] arr) { // BubbleSort

        int n = arr.length;

        for (int x = 0; x < n - 1; x++) {

            for (int i = 0; i < n - 1; i++) {

                if (arr[i] > arr[i + 1]) {

                    int buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;

                }
            }
        }

        return arr;
    }

    public int[] QuickS(int[] arr) { // QuickSort
        doQuickSort(arr, 0,arr.length-1);
        return arr;
    }

    private void doQuickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            doQuickSort(arr, begin, partitionIndex - 1);
            doQuickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public int[] SelectionS(int[] arr) {  // SelectionSort
        int n = arr.length;

        for (int min = 0; min < n - 1; min++) {
            int least = min;
            for (int j = min + 1; j < n; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }

        return arr;
    }

    public int[] InsertionS(int[] arr) {  // InsertionSort

        int buff, j;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] < arr[i]) {
                buff = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;

                while (j > 0 && buff < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }

                arr[j] = buff;
            }
        }
        return arr;
    }

    public int[] MergeS(int[] arr) {  // MergeSort

        doMergeSort(arr, arr.length);

       return arr;
    }

    private static void doMergeSort(int[] a, int n) {

        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        doMergeSort(l, mid);
        doMergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);

    }

    private static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
