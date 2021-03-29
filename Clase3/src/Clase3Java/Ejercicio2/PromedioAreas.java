package Clase3Java.Ejercicio2;

public class PromedioAreas {
    public static double areaPromerio (FiguraGeometrica arr[]){
        double promedio=0;

        for (int i = 0; i < arr.length; i++ ){
            promedio+=arr[i].calcularArea();
        }

        return promedio/arr.length;
    }
}
