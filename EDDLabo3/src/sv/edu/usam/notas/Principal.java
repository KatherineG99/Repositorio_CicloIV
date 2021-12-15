
package sv.edu.usam.notas;


public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Katherine","Gomez");
        estudiante.setNota1(8);
        estudiante.setNota2(15);
        estudiante.setNota3(10);
        System.out.println("Notas de  "+estudiante.nombre+" "+estudiante.getApellido());
        System.out.println("nota 1 : "+estudiante.getNota1());
        System.out.println("nota 2 : "+estudiante.getNota2());
        System.out.println("nota 3 : "+estudiante.getNota3());
    }
}
