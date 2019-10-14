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
public class Persona {
    
    public String nome;
    
    public String cognome;
    
    public String titolo;
    
    public String professione;
    
    public Persona(){
    
    
    nome = " Marco ";
    
    cognome = " Rossi ";
    
    titolo = " Signore ";
    
    professione = " Pizzaiolo ";      
    
    }
    
    
    public String invia_nome(){
        
        return nome;
        
        
    }
    
     public String invia_cognome(){
        
        return cognome;
        
        
    }
     
    public String invia_titolo(){
        
         
        
        return titolo;
        
        
    }
    
     public String invia_professione(){
        
        return professione;
        
        
    }
    
}
