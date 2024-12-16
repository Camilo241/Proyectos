import java.util.ArrayList;

public class Categoria {
    private String nombre;
    ArrayList<String> Categorias = new ArrayList<>();
    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public void CrearCategorias(String nombre){
        Categorias.add(nombre);
    }

    public void LeerCategorias(){
        for (String c : Categorias) {
            System.out.println(c);
        }
    }

    public void ActualizarCategoria(int indice){
        for (int i = 0; i < Categorias.size(); i++) {
            if(indice == i){
                setNombre(nombre);
            }else{
                System.out.println("El indice no fue encontrado");
            }
        }
    }

    public void EliminarCategria(int indice){
        for (int j = 0; j < Categorias.size(); j++) {
            if (indice == j) {
                Categorias.remove(indice);
            }else{
                System.out.println("El indice no fue encontrado");
            }
            
        }
        

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
