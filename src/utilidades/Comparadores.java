
package utilidades;

import entidad.Peliculas;
import java.util.Comparator;


public class Comparadores {
    
  
    public static Comparator<Peliculas> ordenarPorDuracionDescen = new Comparator<Peliculas> () {
        @Override
        public int compare(Peliculas t1, Peliculas t2) {
            return t2.getHora().compareTo(t1.getHora());
        }
    }; 
    
     public static Comparator<Peliculas> ordenarPorDuracionAscen = new Comparator<Peliculas> () {
        @Override
        public int compare(Peliculas t1, Peliculas t2) {
            return t1.getHora().compareTo(t2.getHora());
        }
    };
     
     public static Comparator<Peliculas> ordenarAlfaAZ = new Comparator<Peliculas> () {
        @Override
        public int compare(Peliculas t1, Peliculas t2) {
            return t1.getTitulo().compareTo(t2.getTitulo());
        }
    };
     
     public static Comparator<Peliculas> ordenarAlfaZA = new Comparator<Peliculas> () {
        @Override
        public int compare(Peliculas t1, Peliculas t2) {
            return t2.getTitulo().compareTo(t1.getTitulo());
        }
    };
}


            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
 