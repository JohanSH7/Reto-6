package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Charmeleon extends Pokemon {

    Charmeleon(String nombre, byte nivel, int salud) {
    }
        
    @Override
    public Pokemon evolucionar() {
        Pokemon evolucion1 = new Charizard(nombre, nivel, salud);
        return evolucion1;
    }

    @Override
    String gritar() {
        return "Charmeleon!";
    }
    
}
