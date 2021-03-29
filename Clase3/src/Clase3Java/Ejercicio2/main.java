package Clase3Java.Ejercicio2;

public class main {
    public static void main(String[] args) {

        FiguraGeometrica circulo= new Circulo(4);
        FiguraGeometrica rectangulo= new Rectangulo(7,4);
        FiguraGeometrica triangulo= new Triangulo(3,2);

        System.out.println(rectangulo.calcularArea());
        System.out.println(triangulo.calcularArea());
        System.out.println(circulo.calcularArea());

        FiguraGeometrica arrayFiguras []={circulo,triangulo, rectangulo};

        System.out.println(PromedioAreas.areaPromerio(arrayFiguras));
    }
}
