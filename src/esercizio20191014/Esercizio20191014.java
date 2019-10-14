/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio20191014;

/**
 *
 * @author LAB-INF
 */
public class Esercizio20191014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona ps = new Persona();
       
      String t = ps.invia_titolo();
      System.out.println(" "+ t);
        
      String n = ps.invia_nome();
      System.out.println(" " + n);
      
      String c = ps.invia_cognome();
      System.out.println(" " + c );
      
      String p = ps.invia_professione();
      System.out.println("  Professione: " + p );
        
        
        
    }
    
}
