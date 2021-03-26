package Clase2Java;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if(denominador != 0)
            this.denominador = denominador;
    }

    public Fraccion(int entero){
        this.numerador = entero;
        this.denominador = 1;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void sumar(Fraccion fParaSumar){
        this.numerador = this.numerador * fParaSumar.denominador + fParaSumar.numerador * this.denominador;
        this.denominador = this.denominador * fParaSumar.denominador;
    }

   public void sumar(int num){
        sumar(new Fraccion(num));
   }

   //public static Fraccion suma(Fraccion a, int entero){
   //    Fraccion aux = new Fraccion();
   //    aux.num = (a.den*entero)+a.num;
   //    aux.den = a.den;
   //    return aux;
   //}
   //public Fraccion sumar(Fraccion fr){
   //    this.dividendo*=fr.divisor;
   //    fr.dividendo*=this.divisor;
   //    fr.divisor*=this.divisor;
   //    this.divisor*=fr.divisor;
   //    return new Fraccion(this.dividendo+fr.dividendo, this.divisor+fr.divisor);
   //}

    public void restar(Fraccion fParaRestar){
        this.numerador = this.numerador * fParaRestar.denominador - fParaRestar.numerador * this.denominador;
        this.denominador = this.denominador * fParaRestar.denominador;
    }

    public void restar(int num){
        restar(new Fraccion(num));
    }

    public void multiplicar(Fraccion fParaMultiplicar){
        this.numerador = this.numerador * fParaMultiplicar.numerador;
        this.denominador = this.denominador * fParaMultiplicar.denominador;
    }

    public void multiplicar(int num){
        multiplicar(new Fraccion(num));
    }

    public void dividir(Fraccion fParaDividir){
        this.numerador = this.numerador * fParaDividir.denominador;
        this.denominador = this.denominador * fParaDividir.numerador;
    }
    
    public void dividir(int num){
        dividir(new Fraccion(num));
    }

    public String toString(){
        return this.numerador + "/" + this.denominador;
    }

}
