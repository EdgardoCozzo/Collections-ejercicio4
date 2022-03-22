
package utilidades;

import entidad.Peliculas;
import java.util.Comparator;


public class Comparadores {
    public static Comparator<Peliculas> ordenarPorDuracionDesc = new Comparator<Peliculas> () {
        @Override
        public int compare(Peliculas t1, Peliculas t2) {
            return t2.getHora().compareTo(t1.getHora());
        }
    }; 
    
}


            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
 