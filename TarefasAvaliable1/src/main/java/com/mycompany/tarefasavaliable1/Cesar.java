/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefasavaliable1;

/**
 *
 * @author a13adrianbr
 * 
 * Creado por Adrian Braños Rodriguez
 */
import java.util.Scanner;
 
public class Cesar {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
         
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
 
        System.out.println("Dame una frase");
        String frase = scan.next();
         
        String texto = cifradoCesar(letras, frase);
        System.out.println("Texto codificado: " + texto);
        
        //texto = descodificar(letras, texto);
        //System.out.println("Texto descodificado: " + texto);
         
    }
 
    public static String cifradoCesar(String letras, String texto){
        String textoCodificado = "";
 
        texto = texto.toUpperCase();
 
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
 
            int posisicion = letras.indexOf(caracter);
 
            if(posisicion == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += letras.charAt( (posisicion + 3) % letras.length() );
            }
 
        }
 
        return textoCodificado;
    }
}
    

