import java.util.ArrayList;

public class ListadeCategorias {
    ArrayList<Categoria> listadeCategorias = new ArrayList<>();

    public ListadeCategorias(ArrayList<Categoria> listadecategorias) {
        listadeCategorias = listadecategorias;
    }

    int indice = 0;

    public void CrearCategorias(Categoria categoria){
        listadeCategorias.add(categoria);
        System.out.println("La categoria se Agrego con exito.");
    }

    public void LeerCategorias(){
        if (listadeCategorias.isEmpty()) {
            System.out.println("La cadena esta Vacia.");
        }else{
            for (int i = 0; i < listadeCategorias.size(); i++) {
                Categoria categoria = listadeCategorias.get(i);
                System.out.println("El indice de la categoria es: " + (i+1) + "\nEl nombre de la categoria es: " + categoria.getNombre()  );
            }
        }
    }


    public void ActualizarCategoria(int idActualC,int indice,String nombre){
        if (indice >= 0 && indice < listadeCategorias.size()) {
            Categoria categoriaActualizada = new Categoria(idActualC,nombre);
            listadeCategorias.set(indice,categoriaActualizada);
            System.out.println("Categoria Actualizada con exito");
        }else{
            System.out.println("El indice que ingreso no existe.");
        }
    }

    public void EliminarCategria(int indice){
        for (int j = 0; j < listadeCategorias.size(); j++) {
            if (indice == j) {
                listadeCategorias.remove(indice);
            }else{
                System.out.println("El indice no fue encontrado");
            }
            
        }
        

    }
    
}
