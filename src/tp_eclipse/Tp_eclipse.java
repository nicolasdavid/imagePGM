package tp_eclipse;
import java.io.*;

/**
 *
 * @author Nicolas
 */
public class Tp_eclipse {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        File fichier = new File();
        
        
        System.out.println(fichier.tailleX);
        System.out.println(fichier.tailleY);
        for(int i=0;i<255;i++){
            System.out.println(i +" : "+ fichier.nuancier[i]);
        }
        
            }
}
