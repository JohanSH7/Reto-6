package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Raichu extends Pokemon {

    Raichu(String nombre, byte nivel, int salud) {
    }
    

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException{
        throw new NoEvolucionaException();
    }

    @Override
    String gritar() {
       return "Raichu!"; 
    }
    
}