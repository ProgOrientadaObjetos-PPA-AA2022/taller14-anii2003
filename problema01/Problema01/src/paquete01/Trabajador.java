/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author DELL
 */
public class Trabajador {
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;
    
    public Trabajador(String c, String n, String co, double s, String mes){
        cedula = c;
        nombres = n;
        correo = co;
        sueldo = s;
        mesSueldo = mes;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    
    public void establecerNombres(String n){
        nombres = n;
    }
    
    public void establecerCorreo(String co){
        correo = co;
    }
    
    public void establecerSueldo(double s){
        sueldo = s;
    }
    
    public void establecerMesDeSueldo(String m){
        mesSueldo = m;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerNombres(){
        return nombres;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public String obtenerMesDeSueldo(){
        return mesSueldo;
    }
    
    public String toString(){
        String cadena = String.format("Cédula: %s\n"
                + "Nombres: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes de sueldo: %s\n",
                cedula,
                nombres,
                correo,
                sueldo,
                mesSueldo);
        return cadena;
    }
}
