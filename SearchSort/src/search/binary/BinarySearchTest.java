package search.binary;

public class BinarySearchTest {
    public static void main(String[] args) {
        System.out.println("hi");

        int arr[] = {2, 4, 7, 11, 45, 50, 59, 60, 66, 69, 70, 79};


        System.out.println("Element :"+11 +" Found at : "+search(arr, 11, 0, arr.length - 1));
        System.out.println("Element :"+54 +" Found at : "+search(arr, 54, 0, arr.length - 1));
        System.out.println("Element :"+59 +" Found at : "+search(arr, 59, 0, arr.length - 1));
        System.out.println("Element :"+66 +" Found at : "+search(arr, 66, 0, arr.length - 1));
        System.out.println("Element :"+72 +" Found at : "+search(arr, 72, 0, arr.length - 1));
        System.out.println("Element :"+4 +" Found at : "+search(arr, 4, 0, arr.length - 1));
        System.out.println("Element :"+1 +" Found at : "+search(arr, 2, 0, arr.length - 1));
        System.out.println("Element :"+50 +" Found at : "+search(arr, 50, 0, arr.length - 1));


    }

    private static int search(int[] arr, int elementToBeSearched, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (end + start) / 2;
        int returnElement = 0;
        if (elementToBeSearched == arr[mid]) {
            return mid;
        } else if (elementToBeSearched < arr[mid]) {
            returnElement = search(arr, elementToBeSearched, start, mid - 1);
        } else {
            returnElement = search(arr, elementToBeSearched, mid + 1, end);
        }

        return returnElement;
    }
}
