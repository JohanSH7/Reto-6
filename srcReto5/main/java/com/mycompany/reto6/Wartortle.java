
package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Wartortle extends Pokemon {

    public Wartortle(String nombre, byte nivel, int salud) {
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon evolucion3 = new Blastoise(nombre, nivel, salud);
        return evolucion3;
    }

    @Override
    String gritar() {
        return "Wartortle!";
    }
    
}
