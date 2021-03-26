package SaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prenda prenda1 = new Prenda("Nike","Air");
        Prenda prenda2 = new Prenda("Addidas","Classic");
        Prenda prenda3 = new Prenda("Puma","Puma");
        Prenda prenda4 = new Prenda("Topper","Lala");
        Prenda prenda5 = new Prenda("Converse","lolo");
        Prenda prenda6 = new Prenda("Addidas","New");
        Prenda prenda7 = new Prenda("Jordan","Lele");
        Prenda prenda8 = new Prenda("Vans","Vans");
        List<Prenda> listaPrendas = new ArrayList<Prenda>();
        List<Prenda> listaPrendas2 = new ArrayList<Prenda>();
        List<Prenda> listaPrendas3 = new ArrayList<Prenda>();
        listaPrendas.add(prenda1);
        listaPrendas.add(prenda2);
        listaPrendas2.add(prenda4);
        listaPrendas2.add(prenda5);
        listaPrendas2.add(prenda6);
        listaPrendas3.add(prenda3);
        listaPrendas3.add(prenda8);
        listaPrendas3.add(prenda7);
        GuardaRopa gr = new GuardaRopa();

        System.out.println("Guardando Prendas.....");
        int codigo = gr.guardarPrendas(listaPrendas);
        int codigo2 = gr.guardarPrendas(listaPrendas2);
        int codigo3 = gr.guardarPrendas(listaPrendas3);
        System.out.println("El codigo para retirar es: " + codigo2);
        System.out.println("------Lista de prendas en el Guardaropa-------");
        gr.mostrarPrendas();
        System.out.println("******Fin Lista de prendas en el Guardaropa*****");
        System.out.println("Reclamando prendas correspondientes al codigo: " + codigo2);
        gr.devolverPrendas(codigo2);
        for(Prenda p:listaPrendas){
            System.out.println("Marca: " + p.getMarca() + ", Modelo: " + p.getModelo());
        }
        System.out.println("------Lista de prendas en el Guardaropa-------");
        gr.mostrarPrendas();
        System.out.println("******Fin Lista de prendas en el Guardaropa*****");
    }
}
