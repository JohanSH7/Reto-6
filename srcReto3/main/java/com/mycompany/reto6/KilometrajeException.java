/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto6;

/**
 *
 * @author Johan.henao1
 */
public class KilometrajeException extends Exception{
    public KilometrajeException(){
        super ("No se puede ingresar un kilometraje inferior a 0 ");
    }
}
