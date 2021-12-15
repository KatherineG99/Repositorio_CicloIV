/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Alumno 38
 */
public class Estudiante {
    
    String nombreAlumno;
    String apellidoAlumno;
    int EdadAlumno;
    static String [] materiasAlumno = new String[5];
    
    
    
    //constructor de clase
    public Estudiante (){
        this.nombreAlumno = "Oscar";
        this.apellidoAlumno = "Lopez";
        this.EdadAlumno = 29;
        this.MateriasPrecargadas();
    }    
    
    public void MateriasPrecargadas(){
        materiasAlumno[0] = "Matemáticas";
        materiasAlumno[1] = "Sociales";
        materiasAlumno[2] = "Lenguaje";
        materiasAlumno[3] = "Inglés";
        materiasAlumno[4] = "Arte";
    }
    
    public void IngresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*************************************************");
        System.out.println("Ingresar Nombre de estudiante");
        nombreAlumno = sc.nextLine();
        
        System.out.println("Ingresar Apellido de estudiante");
        apellidoAlumno = sc.nextLine();
        
        System.out.println("Ingresar edad de estudiante");
        EdadAlumno = sc.nextInt();
        
        System.out.println("Ingresar Materias");
        IngresarMaterias();
        
    }
    
    public void IngresarMaterias(){
        System.out.println("*************************************************");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < materiasAlumno.length; i++) {
            System.out.println("Ingrese Materia " + i);
            materiasAlumno[i] = s.nextLine();
        }
    }
    
    public void MostrarDatos(){
        System.out.println("*************************************************");
        System.out.println("Nombre de Estudiante " + nombreAlumno);
        System.out.println("Apellido de Estudiante " + apellidoAlumno);
        System.out.println("Edad de Estudiante " + EdadAlumno);
        System.out.println("*************************************************");
         
        for (int i = 0; i < materiasAlumno.length; i++) {
            int j = 0;
            j = j + i;
            System.out.println("Materia " + j + "= " + materiasAlumno[i]);
        }
    }
    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        //Estudiante Precargado
        //estudiante1.MostrarDatos();
        
        Estudiante estudiante2 = new Estudiante();
        
        estudiante2.IngresarDatos();
        
        //estudiante2.MostrarDatos();
        
    }
    
}
