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
    
    
    protected String chaine ="";
    protected String fichier = "lena.pgm";
    protected int tailleX = 1;
    protected int tailleY = 1;
    protected int niveau = 255;
    protected int[] nuancier = new int[255];
    
    public File(){
    //lecture du fichier texte	
        try{
                InputStream ips=new FileInputStream(fichier); 
                InputStreamReader ipsr=new InputStreamReader(ips);
                BufferedReader br=new BufferedReader(ipsr);
                String ligne;
                int i = 0;
                while ((ligne=br.readLine())!=null){
                        /*System.out.println(ligne);*/
                        chaine+=ligne+"\n";
                        i++;
                        if (i==3){
                            String[] entiers = ligne.split(" ");
                            this.tailleX = Integer.parseInt(entiers[0]);
                            this.tailleY = Integer.parseInt(entiers[1]);

                        }
                        if(i>4){
                            String[] entiers = ligne.split("	");
                            for(int j=0;j<entiers.length; j++){
                                this.nuancier[Integer.parseInt(entiers[j])]++;
                            }
                        }
                }
                br.close(); 
        }	
        catch (Exception e){
                            System.out.println(e.toString());
                    }

        }
}
