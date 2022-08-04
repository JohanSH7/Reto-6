package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Blastoise extends Pokemon {

    public Blastoise(String nombre, byte nivel, int salud) {
    }

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }

    @Override
    String gritar() {
        return "Blastoise!";
    }
    
}
