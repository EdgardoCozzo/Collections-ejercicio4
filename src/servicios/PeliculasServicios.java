/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.{ }
 */
package servicios;

import entidad.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class PeliculasServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Peliculas cargaPeliculas (){
    
        Peliculas p = new Peliculas();
        System.out.println("Ingrese el titulo de una pelicula..");
        p.setTitulo(leer.next());
        System.out.println("Ingrese el director de esa pelicula..");
        p.setDirector(leer.next());
        System.out.println("Ingrese la duracion de esa pelicula");
        p.setHora(leer.nextInt());
        
        
        return p;
    }
    
    public void mostrarPelis(ArrayList<Peliculas>listaPeli){ 
    
        for (Peliculas peliculas : listaPeli) {
            System.out.println(peliculas.toString());
        }
    
        
    }
    
    public void mostrarPeliMasDeUnaHora(ArrayList<Peliculas>listaPeli){ 
        
        
        System.out.println("Las peliculas q son de mas de una hora son = ");
        
       if(listaPeli.iterator().next().getHora()>1){ 
           for (Peliculas pel : listaPeli) {
               System.out.println(pel.toString());
           }
       }
    
    }
    
    public void ordenaMayoraMenor(ArrayList<Peliculas>listaPeli){
    
        Collections.sort(listaPeli, utilidades.Comparadores.ordenarPorDuracionDesc);
        
        for (Peliculas pel : listaPeli) {
            System.out.println(pel.toString());
        }
    }
}