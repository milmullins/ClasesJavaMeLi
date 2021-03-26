package ordenamientoRaiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RadixSort
{
    public static void radixSort(int []arr)
    {
        // PROGRAMAR AQUI
        StringUtil su = new StringUtil();

        String[] arrString = su.toStringArray(arr);
        su.lNormalize(arrString,'0');
        int maxLength = su.maxLength(arrString);
        int count = 0;

        //hashmap para almacenar numeros y ordenarlos
        Map<String,ArrayList<String>> listas = new HashMap<>();

        //creo las listas
        for(int i=0;i<10;i++){
            listas.put("L"+i,new ArrayList<String>());
        }
        //array auxiliar para almacenar mientras se va ordenando
        String[] auxString = new String[arr.length];

        for(int c=1; c<=maxLength;c++){
            for(int i=0; i< arrString.length;i++){
                listas.get("L"+arrString[i].charAt(maxLength-c)).add(arrString[i]);
            }
            count = 0;
            for(int j=0; j < 10;j++){
                while (!listas.get("L"+j).isEmpty()){
                    auxString[count] = listas.get("L"+j).get(0);
                    listas.get("L"+j).remove(0);
                    count++;
                }
            }
            arrString = auxString;
            //System.out.println(Arrays.toString(auxString));
        }
        arr = su.toIntArray(auxString);

        System.out.println(Arrays.toString(arr));

        System.out.println(su.indexOfN("John|Paul|nGeorge|Ringo",'n',3));
    }

    public static void main(String[] args)
    {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
    }
}
