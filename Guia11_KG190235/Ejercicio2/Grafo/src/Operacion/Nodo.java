
package Operacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Nodo {
   private String departamentos;
    private List<Vertice> vertices;

    public Nodo(String departamentos) {
        this.departamentos = departamentos;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }
    
    public List<Vertice> getVertices(){
        return vertices;
    }
    
    public void agregarVertice(Vertice vertice){
        if(vertices == null){
            vertices = new ArrayList<>();
        }
        vertices.add(vertice);
    }
    
    public String toString(){
        return "\n \t Nodo [departamento =" + departamentos + 
                ", vertice =" + vertices + "]";
    }
    
}
