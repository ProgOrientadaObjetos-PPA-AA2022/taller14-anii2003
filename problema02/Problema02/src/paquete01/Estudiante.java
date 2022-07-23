/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author DELL
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    
    public Estudiante(String n, String a, double c1, double c2, double c3){
        nombre = n;
        apellido = a;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerApellido(String a){
        apellido = a;
    }
    
    public void establecerCalificacion1(double c1){
        calificacion1 = c1;
    }
    
    public void establecerCalificacion2(double c2){
        calificacion2 = c2;
    }
    
    public void establecerCalificacion3(double c3){
        calificacion3 = c3;
    }
    
    public void establecerPromedio(){
        promedio = (calificacion1 + calificacion2 + calificacion3)/3;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public double obtenerCalificacion1(){
        return calificacion1;
    }
    
    public double obtenerCalificacion2(){
        return calificacion2;
    }
    
    public double obtenerCalificacion3(){
        return calificacion3;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    public String toString(){
        String cadena = String.format("%s %s\n"
                + "\tCalificaciones: \n"
                + "\t%.1f \n"
                + "\t%.1f \n"
                + "\t%.1f \n"
                + "\tPromedio %.1f \n",
                nombre,
                apellido,
                calificacion1,
                calificacion2,
                calificacion3,
                promedio);
        return cadena;
    }
}
