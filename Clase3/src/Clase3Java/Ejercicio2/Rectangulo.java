package Clase3Java.Ejercicio2;

public class Rectangulo extends FiguraGeometrica{

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return this.lado1+this.lado2;
    }
}
