/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class PesosNoValidosException extends Exception {
    public PesosNoValidosException(){
        super ("El peso no puede ser inferior a cero, hasta una pluma tiene su peso");
    }
    
}
