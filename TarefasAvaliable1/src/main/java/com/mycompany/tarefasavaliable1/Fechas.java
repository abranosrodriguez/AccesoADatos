/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefasavaliable1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author a13adrianbr
 */
public class Fechas {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime el primer nombre");
        String primerNombre = scan.next();
        System.out.println("Dime la fecha: [Dia/Mes/Año]");
        String fecha = scan.next();
        
        Calendar cal=Calendar.getInstance();
        System.out.println("Current Date:"+cal.get(Calendar.DATE));
        System.out.println("Current Month:"+(cal.get(Calendar.MONTH)+1));
        System.out.println("Current Year:"+cal.get(Calendar.YEAR));
       
        
        //System.out.println("Dime el segundo nombre");
        //String segundoNombre = scan.next();

    }

    

}
