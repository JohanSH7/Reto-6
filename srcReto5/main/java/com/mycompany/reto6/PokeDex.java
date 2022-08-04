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
public interface PokeDex {
    
    public String consultar(Pokemon j);
    
    public byte getNivel(Pokemon j);
    
    public String getDescripcion(Pokemon j);
    
    public String getOrigen(Pokemon j);
    
    public int getAnios(Pokemon j);
    
    public int getSalud(Pokemon j);
    
    public String getColor(Pokemon j);
    
    public String getTipo(Pokemon j);

}
