package Controlador;

import Modelo.DAOVino;
import Modelo.Vino;

import java.util.*;

public class Controller {
    Collection<Vino> poblaciones;

    public Controller(Collection<Vino> poblaciones) {
        this.poblaciones = poblaciones;
    }

    /**
     * Ejemplo de shuffling con objetos Collection
     */
    public static void shuffle(){
        List list=new ArrayList<>();
        DAOVino.loadJSON("./datos-vino.json",list); ///Agrega datos al linkedlist
        //Visualizacion de los 5 primeros datos
        Vista.Console.printCollection(list,"Shuffling - Antes");
        Collections.shuffle(list); //"Desordena" la lista
        //Visualizacion de los 5 primeros datos despues del shuffling
        Vista.Console.printCollection(list,"Shuffling - Despues");
    }

    /**
     * Ejemplo de uso de la clase TreeSet
     */
    public static void treeset(){
        TreeSet treeSet=new TreeSet();
        DAOVino.loadJSON("./datos-vino.json",treeSet);//Agrega datos al linkedlist
        Iterator iterator=treeSet.iterator();
        Vista.Console.printCollection(treeSet,"TreeSet");

    }

    /**
     * Ejemplo de uso de la interfaz Iterator en un objeto Collection
     */
    public static void iterator(){
        LinkedList<Vino> linkedList=new LinkedList<>();
        DAOVino.loadJSON("./datos-vino.json",linkedList);//Agrega datos al linkedlist
        Iterator<Vino> iterator=linkedList.iterator();
        int i=0;
        System.out.println("Iterator");
        while (iterator.hasNext() && i<5){
            Vino next=iterator.next(); //Tomamos el siguiente objeto Vino de la lista
            System.out.println(next); //Imprimimos el toString de Vino
            i++;
        }
    }
}
