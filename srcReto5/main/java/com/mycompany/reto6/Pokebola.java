package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Pokebola {
    public String tamanio;
    public Pokemon miPokemon;

    public Pokebola(String tamaño) {
        this.tamanio = tamaño;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Pokemon getMiPokemon() {
        return miPokemon;
    }

    public void setMiPokemon(Pokemon miPokemon) {
        this.miPokemon = miPokemon;
    }

    
    
}
