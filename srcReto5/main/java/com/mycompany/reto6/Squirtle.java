package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Squirtle extends Pokemon{

    public Squirtle(String nombre, byte nivel, int salud) {
    }
        
    @Override
    public Pokemon evolucionar() {
        Pokemon evolucion3 = new Wartortle(nombre, nivel, salud);
        return evolucion3;
    }

    @Override
    String gritar() {
        return "Squirtle!";
    }
    
}
