package sort.quick;

public class QuickSortTemp {
    public static void print(int arr[]) {
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        //int arr[] = {34, 12, 4, 56, 78, 45, 23, 89, 9, 1, 67};
        int arr[] = {3, 9, 6, 2, 5, 8, 1, 7, 4};
        //int arr[] = {100, 200, 70, 10, 5, 90, 80, 60, 50, 40, 20};
        print(arr);

        quickSort(arr, 0, arr.length);
        print(arr);

    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
