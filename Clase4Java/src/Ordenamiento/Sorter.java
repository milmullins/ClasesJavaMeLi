package Ordenamiento;

import java.util.Comparator;

public interface Sorter<T>{

    public T[] sort(T arr[], Comparator<T> c);
}
