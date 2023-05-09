/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriaonline;

/**
 *
 * @author Alunno04
 */
public class Libro {
 private String titolo;
    private String autore;
    private float prezzo; 
    private int codice;
    public Libro(String Titolo, String Autore, float Prezzo){
        setTitolo(titolo);
        setAutore(autore);
        setPrezzo(prezzo); 
        setCodice(codice);
}
    public void setTitolo (String titolo){
         this.titolo=titolo;
     }  
    public void setAutore (String autore){
         this.autore=autore;
     }    
    public void setPrezzo (float prezzo){
         this.prezzo=prezzo;
     }  
    public void setCodice (int codice){
         this.codice=codice;
     }  
    public String getTitolo(){
         return titolo;
     }
     public String getAutore(){
         return autore;
     }
    public float getPrezzo(){
        return prezzo;
    }
    public int getCodice(){
        return codice;
    }   
}
  

