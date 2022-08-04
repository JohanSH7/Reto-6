
package com.mycompany.reto6;

/**
 *
 * @author Johan.henao1
 */
public class BaseDeDatos {
    
    
    public String consultar(String j){
        String consultar = consultar = "Color: " + getColor(j) + "\n" + "Tipo: " + getTipo(j) + "\n" + "Origen: " + getOrigen(j) + "\n" + "Años: " + getAnios(j) + "\n" + "Descripcion: " + getDescripcion(j);
        return consultar;
    }
    public String getOrigen(String j){
        String origen = "";
        switch (j){
            case "Charmander" -> origen = "Montania";
            case "Charmeleon" -> origen = "Montania";
            case "Charizard" -> origen = "Montania";
            case "Squirtle" -> origen = "Agua dulce";
            case "Wartortle" -> origen = "Agua dulce";
            case "Blastoise" -> origen = "Agua dulce";
            case "Pikachu" -> origen = "Bosque";
            case "Raichu" -> origen = "Bosque";
        } 
        return origen;
    }
    public int getAnios(String j){
        int anio = 0;
        switch (j){
            case "Charmander" -> anio = 16;
            case "Charmeleon" -> anio = 32;
            case "Charizard" -> anio = 50;
            case "Squirtle" -> anio = 150;
            case "Wartortle" -> anio = 120;
            case "Blastoise" -> anio = 100;
            case "Pikachu" -> anio = 130;
            case "Raichu" -> anio = 160;
        } 
        return anio;
    }    
    public String getColor(String j){
        String color = "";
        switch (j){
            case "Charmander" -> color = "Naranja";
            case "Charmeleon" -> color = "Rojo";
            case "Charizard" -> color = "Naranja y Azul";
            case "Squirtle" -> color = "Azul cielo";
            case "Wartortle" -> color = "Azul";
            case "Blastoise" -> color = "Azul oscuro";
            case "Pikachu" -> color = "Amarillo";
            case "Raichu" -> color = "Naranja y cafe";
        } 
        return color;
    }
    public String getTipo(String j){
        String tipo = "";
        switch (j){
            case "Charmander" -> tipo = "Fuego";
            case "Charmeleon" -> tipo = "Fuego";
            case "Charizard" -> tipo = "Fuego";
            case "Squirtle" -> tipo = "Agua";
            case "Wartortle" -> tipo = "Agua";
            case "Blastoise" -> tipo = "Agua";
            case "Pikachu" -> tipo = "Electrico";
            case "Raichu" -> tipo = "Electrico";
        } 
        return tipo;
    }  
    public String getDescripcion(String j){
        String descripcion = " ";
        switch (j){
            case "Charmander" -> descripcion = "Uno de los Pokémon iniciales que pueden elegir los entrenadores que empiezan su aventura en la región Kanto, junto a Bulbasaur y Squirtle";
            case "Charmeleon" -> descripcion = "Posee como característica general una llama en la punta de su cola al igual que Charmander y Charizard";
            case "Charizard" -> descripcion = "A partir de la sexta generación, puede megaevolucionar en Mega-Charizard X o en Mega-Charizard Y";
            case "Squirtle" -> descripcion = "La forma redonda de su caparazón y las figuras en su superficie hacen que Squirtle tenga una muy buena forma hidrodinámica, lo que le da mayor velocidad al nadar";
            case "Wartortle" -> descripcion = "Es un Pokémon más agresivo que Squirtle. Se oculta en el agua al cazar, y emerge para sorprender a su presa";
            case "Blastoise" -> descripcion = "Es la evolución de Wartortle y, a partir de la sexta generación, puede megaevolucionar en Mega-Blastoise";
            case "Pikachu" -> descripcion = "Pikachu almacena una gran cantidad de electricidad en sus mejillas. Estas parecen cargarse eléctricamente durante la noche mientras duerme";
            case "Raichu" -> descripcion = "Es una de las dos posibles evoluciones de Pikachu y la forma habitual del Raichu de Alola";
        } 
        return descripcion; 
    }
}    