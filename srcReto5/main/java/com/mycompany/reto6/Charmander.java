package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Charmander extends Pokemon {

    public Charmander(String nombre, byte nivel, int salud) {
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon evolucion1 = new Charmeleon(nombre, nivel, salud);
        return evolucion1;
    }

    @Override
    String gritar() {
        return "Charmander!";
    }
    
}
