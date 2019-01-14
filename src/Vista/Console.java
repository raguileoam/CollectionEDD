package Vista;

import Modelo.Vino;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Console {
    public static void printCollection(Collection list, String title){
        Iterator iterator=list.iterator();
        System.out.println("\n"+title);
        int i=0;
        while (iterator.hasNext() && i<5){
            Object next=iterator.next(); //Tomamos el siguiente objeto de la lista
            System.out.println(next); //Imprimimos el toString del objeto
            i++;
        }
    }
}
