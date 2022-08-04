/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Llanta {
    private String marca;
    private String referencia;
    private double peso;

    public Llanta(String marca, String referencia, double peso)throws PesosNoValidosException{
        this.marca = marca;
        this.referencia = referencia;
        if (peso<0){
            throw new PesosNoValidosException();
        }
        else this.peso = peso;
    }
    public Llanta() throws PesosNoValidosException{
        this("Michelin","30ZR21",72.6f);
    }

    public String getMarca() {
        return marca;
    }
    public String getReferencia() {
        return referencia;
    }
    public double getPeso() {
        return peso;
    }

    
}
