package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public abstract class Pokemon {
    protected String nombre;
    protected byte nivel;
    protected int salud;
    
    abstract Pokemon evolucionar() throws NoEvolucionaException;
    abstract String gritar();

}
