package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Charizard extends Pokemon {

    Charizard(String nombre, byte nivel, int salud) {
    }

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException{
        throw new NoEvolucionaException();
    }

    @Override
    String gritar() {
        return "Charizard!";
    }
    
}
