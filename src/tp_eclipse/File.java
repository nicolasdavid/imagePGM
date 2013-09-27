/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_eclipse;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Nicolas
 */
public class File {
    
    
    String chaine ="";
    String fichier = "lena.pgm";
    
    public File(){
    //lecture du fichier texte	
        try{
                InputStream ips=new FileInputStream(fichier); 
                InputStreamReader ipsr=new InputStreamReader(ips);
                BufferedReader br=new BufferedReader(ipsr);
                String ligne;
                while ((ligne=br.readLine())!=null){
                        System.out.println(ligne);
                        chaine+=ligne+"\n";
                }
                br.close(); 
        }	
        catch (Exception e){
                            System.out.println(e.toString());
                    }


        }
}
