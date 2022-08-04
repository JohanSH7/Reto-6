/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Vendedor {
    private String id;
    private String nombre;
    private String apellido;
    private String descripcion;
    private int edad;
    private int anioIngreso;
    private double totalVentas;

    public Vendedor(String id, String nombre, String apellido, String descripcion, int edad, int anioIngreso, double totalVentas) throws NoEdadException, IngresoNoValidoException{
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        if (edad<18){
            throw new NoEdadException();
        }
        else this.edad = edad;
        if (anioIngreso>=2022){
            throw new IngresoNoValidoException();
        }
        else this.anioIngreso = edad;
        this.totalVentas = totalVentas;
    }
    public Vendedor() {
        id = "2872920"; 
        nombre= "Johan";
        apellido= "Henao";
        descripcion= "Puntual, Solidario, Simpatico";
        edad= 29;
        anioIngreso=2002;
        totalVentas= 900000000;
    }
    
    public String calificarVendedor(){
        if (totalVentas <= 0){
            return "Vendedor novato";
        } else if (totalVentas>0 && totalVentas<=500000000){
            return "Vendedor principiante"; 
        } else if (totalVentas>500000000 && totalVentas<=2000000000){
            return "Vendedor intermedio"; 
        } else if (totalVentas>2000000000) {
            return "Vendedor avanzado"; 
        } else 
            return "valor fuera de rango";
    }  
    public String calificarCalidadVendedor(){
        if (totalVentas>0 && totalVentas<=2000000000){
            if (anioIngreso<=2010){
                return "Vendedor malo";
            }  
        } else if (totalVentas>0 && totalVentas<=2000000000){
            if (anioIngreso>2010 && anioIngreso<=2018){
                return "Vendedor regular";
            }
        } else if (totalVentas>0 && totalVentas<=2000000000){
            if (anioIngreso>2018 && anioIngreso<=2022){
                return "Vendedor malo";
            }
        }
            return "No es posible calcular";
    }
    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getEdad() {
        return edad;
    }
    public int getAnioIngreso() {
        return anioIngreso;
    }
    public double getTotalVentas() {
        return totalVentas;
    } 

    @Override
    public String toString() {
        return "Vendedor{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", descripcion=" + descripcion + ", edad=" + edad + ", anioIngreso=" + anioIngreso + ", totalVentas=" + totalVentas + '}';
    }
    
    
}
