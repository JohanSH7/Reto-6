package com.mycompany.reto6;

/**
 *
 * @author Escuiquirin
 */
public class Reto5 {
    public static void main(String[] args) {
        //creando pokebolas
        Pokebola pokeBolita1= new Pokebola("pequeña");
        Pokebola pokeBolita2= new Pokebola("mediana");
        Pokebola pokeBolita3= new Pokebola("grande");
        //creando pokemones
        Pokemon fuego = new Charmander("Juanito", (byte) 9, 230); 
        Pokemon rayo = new Pikachu("Ibai", (byte) 10, 250); 
        Pokemon agua = new Squirtle("Auron", (byte) 7, 310); 
        //encerrando pokemones
        pokeBolita1.setMiPokemon(fuego);
        pokeBolita2.setMiPokemon(rayo);
        pokeBolita3.setMiPokemon(agua);
        //evoluciones
        try {
            fuego = fuego.evolucionar();
            fuego = fuego.evolucionar();
            fuego = fuego.evolucionar();
            agua = agua.evolucionar();
        } catch (NoEvolucionaException e) {
            System.out.println(e.getMessage());
        }
        
        // gritos
        System.out.println(fuego.gritar());
        System.out.println(rayo.gritar());
        System.out.println(agua.gritar());
        
        //Datos pokemones
        //Objeto de la clase PokeDex
        PokeDex r = new PokeDexGoogle();
        //Imprimiendo datos
        System.out.println(r.consultar(fuego));
        
        /*
        Pokemon rayoSuprem = new Pikachu("Nuevo", (byte) 10, 250);
        Pokemon fueInferno = new Charizard("ChasChas", (byte) 20, 900);
        try {
            fueInferno = fueInferno.evolucionar();
        } catch (NoEvolucionaException e) {
            System.out.println(e.getMessage());
        }
*/
        
    }
}
