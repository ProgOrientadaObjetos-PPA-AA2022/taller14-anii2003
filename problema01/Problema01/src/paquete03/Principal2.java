/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Enlace;

/**
 *
 * @author DELL
 */
public class Principal2 {
    public static void main(String[] args) {
        Enlace c = new Enlace();
        
        for (int i = 0; i < c.obtenerDataTrabajador().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataTrabajador().get(i)); 
        }         
    }
}
