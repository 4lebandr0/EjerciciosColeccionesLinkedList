import java.util.LinkedList;

public class punto2 {

    /*
        AUTOR a219206862@unison.mx
     */

    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        LinkedList listaMaligna = new LinkedList();
        int ascii = 97;

        //Llenar primer lista
        for (int i = 0; i < 10; i++){
            lista.add(i, ((char)(ascii+i)));
        }

        //Llenar lista maligna
        for (int i = 0; i < 10; i++){

            listaMaligna.add(lista.get((lista.size()-1)-i));

        }

        //Comparar listas
        System.out.println("Lista 1: ");
        for (int i = 0; i < 10; i++){
            System.out.println(lista.get(i));
        }
        System.out.println("");
        System.out.println("Lista 2: ");
        for (int i = 0; i < 10; i++){
            System.out.println(listaMaligna.get(i));
        }

    }


}
