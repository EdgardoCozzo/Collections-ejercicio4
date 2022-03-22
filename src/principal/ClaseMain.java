/*

 */
package principal;

import entidad.Peliculas;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.PeliculasServicios;

/**
 *
 * @author Edgardo
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculasServicios serv = new PeliculasServicios();
        ArrayList<Peliculas>listaPeli = new ArrayList();
       
        
        String rta = "";
        do {

            listaPeli.add(serv.cargaPeliculas());
            
            System.out.println("Desea ingresar otra Pelicula??");
            rta = leer.next();
        } while (rta.equalsIgnoreCase("si"));
        
        System.out.println("===================================");
      
        serv.mostrarPelis(listaPeli);
        //serv.mostrarPeliMasDeUnaHora(listaPeli);
        serv.ordenaMayoraMenor(listaPeli);
        
    }
      
      
}
