package com.mycompany.reto6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Automovil rayoMcqueen = new Automovil ("SCE777", "Renault", "Morado", "furia total", 2013, 2012, 10000, 100);
            System.out.println(rayoMcqueen.calcularUsoAutomovil());
        } catch (KilometrajeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Vendedor jBalvin = new Vendedor ("5803", "Paco", "Hernandez", "Galan", 18, 2021, 90);
            System.out.println(jBalvin.calificarCalidadVendedor());
        } catch (NoEdadException e) {
            System.out.println(e.getMessage());
        } catch (IngresoNoValidoException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            Llanta superVeloces = new Llanta ("Michelin", "Canadienses", -10);
            Motor caballote = new Motor ("Italiani", "WR500", "4 valvulas", 1500000, 400);
        } catch (PesosNoValidosException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
