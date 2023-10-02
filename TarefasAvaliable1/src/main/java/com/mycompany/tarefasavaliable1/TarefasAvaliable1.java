/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarefasavaliable1;

/**
 *
 * @author a13adrianbr
 * 
 * Creado por Adrian Braños Rodriguez
 */

public class TarefasAvaliable1 {

    public static void main(String[] args) {
        //Ejercicio 1:
        Trabajador t = new Trabajador("Juan", 32, 2, 2);
        System.out.println(t.getNombre()+" "+t.getEdad()+" "+t.getCategoria()+" "+t.getAntiguedad());
        System.out.println("El sueldo calculado es de:"+t.calcularSueldo());
        
        //Ejercicio 2:
        Cesar.main(args);
        
        //Ejercicio 3:
        Numericos.main(args);
        
        //Ejercicio 4:
        Fechas.main(args);
    }
}
