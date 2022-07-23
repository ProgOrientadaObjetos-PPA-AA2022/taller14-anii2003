/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
import paquete01.Trabajador;
import paquete02.Enlace;

/**
 *
 * @author DELL
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        String cedula;
        String nombres;
        String correo;
        double sueldo;
        String mesSueldo;
        String continuar;

        Enlace c = new Enlace();

        do {
            System.out.println("Ingrese la cédula: ");
            cedula = leer.nextLine();
            
            System.out.println("Ingrese los nombres del trabajador: ");
            nombres = leer.nextLine();
            
            System.out.println("Ingrese el correo: ");
            correo = leer.nextLine();

            System.out.println("Ingrese el sueldo: ");
            sueldo = leer.nextDouble();
            leer.nextLine();

            System.out.println("Ingrese el mes de sueldo: ");
            mesSueldo = leer.nextLine();

            Trabajador t = new Trabajador(cedula, nombres, correo, sueldo, 
            mesSueldo);

            c.insertarTrabajador(t);

            System.out.println("¿Desea ingresar más trabajadores?\n"
                    + "Pulse S para seguir ingresando o N para salir");
            continuar = leer.nextLine();

        } while (continuar.equals("S"));
    }

}
