package queue;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestQueue {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        LinkedList<String> list1 = new LinkedList<String>();


        doSomethingWithMyList(list);
        doSomethingWithMyList(list1);



        SequentialSearch sequentialSearch = new SequentialSearch();

        BinarySearch binarySearch = new BinarySearch();

        TestSearch testSearch = new TestSearch();

        int arr[] = {1, 2, 3, 4};


        testSearch.search(sequentialSearch, arr);
        testSearch.search(binarySearch, arr);


      //  ArraySearch arraySearch = new BinarySearch();
       // arraySearch.search(arr);
        int j= 2;
        print(j);
    }

    public static  void  print(int i) { //int i = j;

    }

    public static void doSomethingWithMyList(List list){
        int size = list.size();
    }
}
