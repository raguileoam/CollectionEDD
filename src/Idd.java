import Modelo.DAOVino;
import Modelo.Vino;

import java.util.*;

public class Idd {
    public static void shuffle(){
        List list=new ArrayList<>();
        DAOVino.loadJSON("./datos-vino.json",list);
        System.out.println("\nAntes");
        for(int i=0;i<5;i++) System.out.println(list.get(i));
        Collections.shuffle(list);
        System.out.println("\nDespues");
        for(int i=0;i<5;i++) System.out.println(list.get(i));


    }
    public static void main(String[] args) {
        shuffle();
        //treeset();
        //iterator();

    }
    public static void treeset(){
        Collection treeSet=new TreeSet();
        DAOVino.loadJSON("./datos-vino.json",treeSet);
        Iterator iterator=treeSet.iterator();
        while (iterator.hasNext()){
            Object next=iterator.next();
            System.out.println(next);
        }
    }


    public static void iterator(){
        //Podemos usar Collection e instanciarlo bajo cualquier otra clase hija como TreeSet,ArrayList,etc.
        //Casos como TreeMap o que vengan de NavegableMap no son parte de la interfaz Collection
        LinkedList linkedList=new LinkedList<>();
        DAOVino.loadJSON("./datos-vino.json",linkedList);
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext()){
            Object next=iterator.next();
            System.out.println(next);
        }
    }
}
