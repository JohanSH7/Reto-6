/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Automovil {
    private String placa;
    private String marca;
    private String color;
    private String descripcion;
    private int modelo;
    private int anioFabricacion;
    private double precio;
    private double kilometraje;

    public Automovil(String placa, String marca, String color, String descripcion, int modelo, int anioFabricacion, double precio, double kilometraje) throws KilometrajeException{
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.descripcion = descripcion;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        if (kilometraje<0){
            throw new KilometrajeException();
        }
        else this.kilometraje = kilometraje;   
    }

    public Automovil() {
        placa= "FCS999";
        marca= "Ferrari";
        color = "rojo";
        descripcion= "Coche deportivo y lujoso";
        modelo=2021;
        anioFabricacion= 2020;
        precio= 500000000;
        kilometraje=1200;
        
    }
    
    
    
    public String calcularUsoAutomovil(){
        String uso= null;
        if (kilometraje < 1000){
            uso= "Auto nuevo";
        }
        if (kilometraje > 1000 && kilometraje < 20000){
            uso= "Auto casi nuevo";
        }
        if (kilometraje > 20000 && kilometraje < 100000){
            uso= "Auto muy usado";
        }
        return uso;
    }
    
    public String calcularCalidadAutomovil (){
        if (anioFabricacion < 2015 ){
            return "modelo antiguo";
        }
        if (anioFabricacion >= 2015 && anioFabricacion < 2020){
            return "modelo intermedio";
        }
        if (kilometraje == 2021){
            return "modelo nuevo";
        }
        if (kilometraje == 2022){
            return "ultimo-modelo";
        }
        return null;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public double getKilometraje() {
        return kilometraje;
    }
    
    
    
}
