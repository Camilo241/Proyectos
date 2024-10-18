package ListaTareas;

import java.util.ArrayList;

public class ListadeTarea {
    ArrayList<Tarea> listaTareas = new ArrayList<>();
    private int indice = 0;

    public ListadeTarea(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public void AgregarTarea(Tarea tarea){
        listaTareas.add(tarea);
    }
    
    public void TraerTarea(){
        if (listaTareas.isEmpty()) {
            System.out.println("La lista esta Vacia.");
        }else{
            for (int i = 0; i < listaTareas.size(); i++) {
                System.out.println(listaTareas.get(i));
            }
        }
        

    }

    public void Actualizar(Tarea tarea, int indice){
        listaTareas.set(indice,tarea);
    }

    public void Eliminar(int indice){
        listaTareas.remove(indice);
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    

    
}
