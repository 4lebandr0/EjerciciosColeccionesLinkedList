import java.util.Comparator;
import java.util.LinkedList;

public class punto1 {

    /*
        AUTOR a219206862@unison.mx
     */

    public static void main(String[] args) {

            LinkedList lista = new LinkedList();
            int sum = 0;
            float prom = 0;

            //Llenar arreglo 0-100
            for (int i = 0; i < 25; i++){

                lista.add(i , (int)(Math.random()*101));

            }

            //Ordenado ascendente
            lista.sort(Comparator.naturalOrder());

            //Comprobar ordenado
        System.out.println("Lista: ");
            for (int i = 0; i < 25; i++){

                System.out.println(lista.get(i));

            }
            System.out.println("");

            //Suma y promedio
            for (int i = 0; i < 25; i++){

                sum += ((int)(lista.get(i)));

            }
            prom = (float)(sum)/25;

            //Imprimir suma y promedio
            System.out.println("Suma: " + sum);
            System.out.println("Promedio: " + prom);

    }


}
