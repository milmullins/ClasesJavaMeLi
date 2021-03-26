package Clase2Java;

public class CuentaCorriente {
    private double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuenta){
        this.saldo = cuenta.saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double dIngreso){
        if(dIngreso>0)
            this.saldo += dIngreso;
    }

    public void egreso(double dEgreso){
        if((this.saldo-dEgreso)>0)
            this.saldo -= dEgreso;
    }

    public void reintego(double dReintegro){
        if(dReintegro>0)
            this.ingreso(dReintegro);
    }
    //ToDO
    public void transferencia(CuentaCorriente cuentaDestino,double dImporte){
        this.egreso(dImporte);
        cuentaDestino.ingreso(dImporte);

    }
}
