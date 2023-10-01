package SelectionSort;

public class SelectionSortTest {
    public static void main(String[] args) {
        System.out.println("hi");

        int arr[] = {5, 2, 1, 10, 4, -100, -150, 800};
        display(arr);
        sort(arr);
    }

    private static void sort(int[] arr) {


        for (int index = 0; index < arr.length; index++) {
            System.out.println("----------------------");
            int valueToBeSwapped = arr[index];
            System.out.println("value to be swapped : " + valueToBeSwapped);

            //find the min
            int min = arr[index];
            //TODO
            int indexWhereMinimumIs =index;
            for(int i = index; i <arr.length-1; i++) {
                if(arr[i+1] < min) {
                    min = arr[i+1];
                    indexWhereMinimumIs = i+1;
;                }
            }

            System.out.println("Min value in remaining array : " +min);

            arr[index] = min;
            arr[indexWhereMinimumIs] = valueToBeSwapped;

            display(arr);



        }

    }

    public static void display(int arr[]) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
