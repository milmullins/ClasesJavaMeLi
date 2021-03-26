package Ordenamiento;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T> {

    private Comparator comp;

    @Override
    public T[] sort(T[] arr, Comparator<T> c) {
        comp = c;
        quicksort(arr, 0, arr.length - 1);
        return arr;
    }

    private T[] quicksort(T[] array, int startIndex, int endIndex) {
        // verify that the start and end index have not overlapped
        if (startIndex < endIndex) {
            // calculate the pivotIndex
            int pivotIndex = partition(array, startIndex, endIndex);
            // sort the left sub-array
            quicksort(array, startIndex, pivotIndex);
            // sort the right sub-array
            quicksort(array, pivotIndex + 1, endIndex);
        }
        return array;
    }

    private int partition(T[] array, int startIndex, int endIndex) {
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;

        while (true) {
            // start at the FIRST index of the sub-array and increment
            // FORWARD until we find a value that is > pivotValue
            do startIndex++; while (comp.compare(array[startIndex], pivotValue) < 0);

            // start at the LAST index of the sub-array and increment
            // BACKWARD until we find a value that is < pivotValue
            do endIndex--; while (comp.compare(array[endIndex], pivotValue) > 0);

            if (startIndex >= endIndex) return endIndex;

            // swap values at the startIndex and endIndex
            T temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }
}
