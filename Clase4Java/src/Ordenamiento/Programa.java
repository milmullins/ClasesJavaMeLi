package Ordenamiento;

import java.util.Comparator;

public class Programa {
    public static void main(String[] args) throws InterruptedException {
        Integer[] intArray = {231, 54, 12, 1, 54, -65, 86, -1};
        String[] stringArray = {"f", "c", "a", "d", "b", "e", "g"};

        Sorter sorter = (Sorter)MiFactory.getInstance("sorter");

        Comparator<String> compString = (str1,str2) ->str1.compareTo(str2);
        Comparator<Integer> compInteger = (int1,int2) ->int1.compareTo(int2);
        QuickSortSorterImple quickSort = new QuickSortSorterImple();
        HeapSortSorterImple heapSort = new HeapSortSorterImple();
        BubbleSortSorterImple bubbleSort = new BubbleSortSorterImple<>();

        //System.out.println("Old Integer[]: " + Arrays.toString(intArray));
        //System.out.println("New Integer[]: " + Arrays.toString(sorter.sort(intArray,compInteger)));

        //System.out.println("Old String[]: " + Arrays.toString(stringArray));
        //System.out.println("New String[]: " + Arrays.toString(sorter.sort(stringArray,compString)));
        Integer[] arrayLargo = new Integer[100000];
        int j= 0;
        for(int i=100000;i>0;i--){
            arrayLargo[j] = i;
            j++;
        }

        Time time = new Time();

        time.Start();
        sorter.sort(arrayLargo,compInteger);
        time.Stop();
        System.out.println(time.elapsedTime());
    }
}
