package Clase2Java;

public class Contador {
    private int valor;
    private int salto;

    public Contador(){
    }

    public Contador(int valor) {
        this.valor = valor;
        this.salto = salto;
    }

    public Contador(Contador cont){
        this.valor = cont.valor;
        this.salto = cont.salto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }

    public void incrementar(){
        this.valor+=this.salto;
    }
    public  void decrementar(){
        this.valor-=this.salto;
    }
}
