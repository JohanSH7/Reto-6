package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Pikachu extends Pokemon {

    public Pikachu(String nombre, byte nivel, int salud) {
    }

    
    @Override
    public Pokemon evolucionar() {
        Pokemon evolucion2 = new Raichu(nombre, nivel, salud);
        return evolucion2;
    }

    @Override
    String gritar() {
        return "Pika Pika!";
    }
    
}
