package TT;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{


    @Override
    public void sort(T[] arr, Comparator<T> c) {
        quickSort(arr, 0, arr.length-1, c);
    }

    public void quickSort(T arr[], int begin, int end, Comparator<T> c) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end, c);

            quickSort(arr, begin, partitionIndex, c);
            quickSort(arr, partitionIndex+1, end, c);
        }
    }


    public int partition(T[] arr, int low, int high, Comparator<T> c) {
        if (arr ==null || arr.length==0){
            throw new RuntimeException("Empty array");
        }
        T pivot = arr[high];
        int i = (low-1); // smaller element index

        for (int j = low; j < high; j++) {
            // check if current element is less than or equal to pi
            if (c.compare(arr[j], pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }

        // swap intArray[i+1] and intArray[high] (or pi)
        swap(arr, i + 1, high);

        return i+1;
    }

    private void swap(T[] arr, int a, int b){
        T swapTemp = arr[a];
        arr[a] = arr[b];
        arr[b] = swapTemp;
    }
}
