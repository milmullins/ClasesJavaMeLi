package Ordenamiento;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T>{
    private Comparator comp;
    @Override
    public T[] sort(T[] arr, Comparator<T> c) {
        comp = c;
        bubbleSort(arr);
        return arr;
    }

    private T[] bubbleSort(T[] array) {
        for(int j=0; j< array.length;j++){
            for(int i=0; i< array.length-1;i++){
                if(comp.compare(array[i],array[i+1]) > 0){
                    T aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                }
            }
        }
        return array;
    }
}
