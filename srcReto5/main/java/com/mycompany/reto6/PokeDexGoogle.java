
package com.mycompany.reto6;

/**
 *
 * @author Johan.henao1
 */
public class PokeDexGoogle implements PokeDex {
    
    @Override
    public int getSalud(Pokemon j) {
        return j.salud;
    }
    @Override
    public byte getNivel(Pokemon j) {
        return j.nivel;
    }
    
    
    @Override
    public String consultar(Pokemon j) {
        String pokeConsulta = j.getClass().getSimpleName();
        System.out.println(pokeConsulta);
        BaseDeDatos d = new BaseDeDatos();
        return d.consultar(pokeConsulta);
    }
    @Override
    public String getDescripcion(Pokemon j) {
        String pokeDes = j.getClass().getSimpleName();
        System.out.println(pokeDes);
        BaseDeDatos d = new BaseDeDatos();
        return d.getDescripcion(pokeDes);
    }
    @Override
    public String getOrigen(Pokemon j) {
        String pokeOrigen = j.getClass().getSimpleName();
        System.out.println(pokeOrigen);
        BaseDeDatos d = new BaseDeDatos();
        return d.getOrigen(pokeOrigen);
    }
    @Override
    public int getAnios(Pokemon j) {
        String pokeEdad = j.getClass().getSimpleName();
        System.out.println(pokeEdad);
        BaseDeDatos d = new BaseDeDatos();
        return d.getAnios(pokeEdad);
    }
    @Override
    public String getColor(Pokemon j) {
        String pokeColor = j.getClass().getSimpleName();
        System.out.println(pokeColor);
        BaseDeDatos d = new BaseDeDatos();
        return d.getColor(pokeColor);
    }
    @Override
    public String getTipo(Pokemon j) {
        String pokeTipo = j.getClass().getSimpleName();
        System.out.println(pokeTipo);
        BaseDeDatos d = new BaseDeDatos();
        return d.getTipo(pokeTipo);
    }
    
}
