package Controlador;

import Modelo.DAOVino;
import Modelo.Vino;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    Collection<Vino> poblaciones;

    public Controller(Collection<Vino> poblaciones) {
        this.poblaciones = poblaciones;
    }

    public static void main(String[] args) {
        List linkedList=new LinkedList<>();
        //Controller controller=new Controller(DAOVino.loadJSON("datos-vino.json",linkedList));
    }
}
