package Clase3Java.Ejercicio2;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio,2);
    }
}
