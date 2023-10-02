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
public class Trabajador {
    
    private String nombre;
    private int edad;
    private int categoria;
    private int antiguedad;
       
    public static final int CAT_EMPLEADO = 0;
    public static final int CAT_ENCARGADO = 1;
    public static final int CAT_DIRECTIVO = 2;
    public static final int ANT_NOVATO = 0;
    public static final int ANT_MADURO = 1;
    public static final int ANT_EXPERTO = 2;
        
    public Trabajador(String nombre,int edad, int categoria, int antiguedad){
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
        this.antiguedad = antiguedad;
        
        Comprobacion();
        calcularSueldo();
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    private void Comprobacion(){
        if(categoria < CAT_EMPLEADO || categoria > CAT_DIRECTIVO){
            throw new IllegalArgumentException("Categoria dentro de CAT no valida");
        }else if(antiguedad < ANT_NOVATO || antiguedad > ANT_EXPERTO){
            throw new IllegalArgumentException("Categoria dentro de ANT no valida");
        }
    }
   
    double sueldoBase = 607;
    int empleado = 15;
    int encargado = 35;
    int directivo = 60;
        
    int novato = 150;
    int maduro = 300;
    int experto = 600;
    
    double sueldo;
    double sueldoCat;
    double sueldoAnt;
    
    public double calcularSueldo(){
        sueldo = sueldoBase;
        if(categoria == CAT_EMPLEADO){
            if(antiguedad == ANT_NOVATO){
                sueldo = sueldo + ((sueldoBase*15)/100) + 150;
                return sueldo;
            }else if(antiguedad == ANT_MADURO){
                sueldo = sueldo + ((sueldoBase*35)/100) + 150;
                return sueldo;
            }else if(antiguedad == ANT_EXPERTO){
                sueldo = sueldo + ((sueldoBase*60)/100) + 150;
                return sueldo;
            }
        }else if (categoria == CAT_ENCARGADO){
            if(antiguedad == ANT_NOVATO){
                sueldo = sueldo + ((sueldoBase*15)/100) + 300;
                return sueldo;
            }else if(antiguedad == ANT_MADURO){
                sueldo = sueldo + ((sueldoBase*35)/100) + 300;
                return sueldo;
            }else if(antiguedad == ANT_EXPERTO){
                sueldo = sueldo + ((sueldoBase*60)/100) + 300;
                return sueldo;
            }
        }else if(categoria == CAT_DIRECTIVO){
            if(antiguedad == ANT_NOVATO){
                sueldo = sueldo + ((sueldoBase*15)/100) + 600;
                return sueldo;
            }else if(antiguedad == ANT_MADURO){
                sueldo = sueldo + ((sueldoBase*35)/100) + 600;
                return sueldo;
            }else if(antiguedad == ANT_EXPERTO){
                sueldo = sueldo + ((sueldoBase*60)/100) + 600;
                return sueldo;
            }
        }
        return sueldo;  
    }
 
}
