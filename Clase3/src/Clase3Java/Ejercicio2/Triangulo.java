package Clase3Java.Ejercicio2;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base*this.altura)/2;
    }
}
