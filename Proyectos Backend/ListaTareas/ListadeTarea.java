

import java.util.ArrayList;

public class ListadeTarea {
    ArrayList<Tarea> listaTareas = new ArrayList<>();
    private int indice = 0;

    public ListadeTarea(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public void AgregarTarea(Tarea tarea){
        listaTareas.add(tarea);
        System.out.println("La tarea fue agregada con exito.");
    }
    
    public void TraerTarea(){
        if (listaTareas.isEmpty()) {
            System.out.println("La lista esta Vacia.");
        }else{
            for (int i = 0; i < listaTareas.size(); i++) {
                Tarea tarea = listaTareas.get(i);
                System.out.println("Tarea " + (i + 1) + ": " + tarea);
            }
        }
        

    }

    public void Actualizar(int idActual,String Nombre,String Descripcion,String Categoria,boolean Completado, int indice){
        if (indice >= 0 && indice < listaTareas.size()) {
            Tarea tareaActualizada = new Tarea(idActual, Nombre, Descripcion, Categoria, Completado);
            listaTareas.set(indice,tareaActualizada);
            System.out.println("Tarea Actualizada con exito");
        }else{
            System.out.println("El indice que ingreso no existe.");
        }
        
    }

    public void Eliminar(int indice){
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.remove(indice);
            System.out.println("La tarea fue borrada con exito.");
        } else {
            System.out.println("El indice ingresado no existe.");
        }
        
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    

    
}
