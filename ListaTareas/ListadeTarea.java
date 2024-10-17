package ListaTareas;

import java.util.ArrayList;

public class ListadeTarea {
    ArrayList<Tarea> listaTareas = new ArrayList<>();

    public void AgregarTarea(Tarea tarea){
        listaTareas.add(tarea);
    }
    
    public void TraerTarea(){
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println(listaTareas.get(i));
        }

    }

    public void Actualizar(){

    }

    public void Eliminar(){

    }
}
