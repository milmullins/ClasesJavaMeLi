package SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private int contador = 0;
    private HashMap<Integer, List<Prenda>> mapPrendas = new HashMap<>();

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        contador++;
        mapPrendas.put(contador,listaDePrenda);
        return contador;
    }

    public void mostrarPrendas(){
        for(Map.Entry<Integer, List<Prenda>> entry:mapPrendas.entrySet()){
            System.out.println("-----Lista Nro: " + entry.getKey() + "-------");
            for(Prenda p:entry.getValue()){
                System.out.println("Nro: " + entry.getKey() + ", Marca: " + p.getMarca() + ", Modelo: " + p.getModelo());
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        List<Prenda> devolver = mapPrendas.get(numero);
        mapPrendas.remove(numero);
        //contador--;
        return devolver;
    }
}
