package Clase2Java;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        try {
            GregorianCalendar gc = new GregorianCalendar(anio, mes, dia);
            //LocalDate fecha = LocalDate.of(anio, mes, dia);
        } catch (Exception e) {
            System.out.println("Se creó una fecha erronea");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean validarFecha(String fecha){
        String[] auxFecha = fecha.split("/");
        if(auxFecha.length == 3){
            return validarFecha(Integer.parseInt(auxFecha[0]),Integer.parseInt(auxFecha[1]),Integer.parseInt(auxFecha[2]));
        }else{
            return false;
        }
    }

    public boolean validarFecha(int dia,int mes,int anio){
        try {
            GregorianCalendar gc = new GregorianCalendar(anio, mes, dia);
            //LocalDate fecha = LocalDate.of(anio, mes, dia);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void sumaDia() {

        if (validarFecha(dia, mes, anio)){
            GregorianCalendar gc = new GregorianCalendar(anio, mes, dia);
            gc.add(gc.DAY_OF_MONTH,1);
            this.dia = gc.get(gc.DAY_OF_MONTH);
            this.mes = gc.get(gc.MONTH);
            this.anio = gc.get(gc.YEAR);
            //LocalDate fecha = LocalDate.of(anio, mes, dia);
            //fecha = fecha.plusDays(1);
            //this.dia = fecha.getDayOfMonth();
            //this.mes = fecha.getMonthValue();
            //this.anio = fecha.getYear();
        }else{
            System.out.println("La fecha ingresada es incorrecta.");
        }

    }

    @Override
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.anio;
    }
}
