/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefasavaliable1;

import java.util.Scanner;

/**
 *
 * @author a13adrianbr
 */
public class Numericos {
    public static void main(String[] args){
        int opcion = 0;

        while(opcion != 3){
            Scanner scan = new Scanner(System.in);
            System.out.println("Dime un numero con decimales");
            String numero = scan.next();

            System.out.println("Dime que quieres hacer:, \n1 - Entero, \n2 - Decimales \n3 - Salir");
            opcion = scan.nextInt();
            
            if(opcion == 1){
                double doubleNumero = Double.parseDouble(numero);
                System.out.println("El numero de la parte entera es: "+getParteEntera(doubleNumero));
            }else if(opcion == 2){
                double doubleNumero = Double.parseDouble(numero);
                System.out.println("El numero de la parte decimal es: "+getParteDecimal(doubleNumero));
            }else if (opcion == 3){
                System.out.println("Saliendo");

            }
        }
       
    }
    
    public static int getParteEntera(double numero){
        String numeroE = String.valueOf(numero);
        int posicionComa = numeroE.indexOf('.');
        int parteEntera = Integer.parseInt(numeroE.substring(0,posicionComa));
        return parteEntera;
    }
    
    public static int getParteDecimal(double numero){
        String numeroD = String.valueOf(numero);
        int posicionComa = numeroD.indexOf('.');
        int parteDecimal = Integer.parseInt(numeroD.substring(posicionComa+1));
        return parteDecimal;
    }
}
