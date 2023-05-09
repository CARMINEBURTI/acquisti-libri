/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriaonline;

/**
 *
 * @author Alunno04
 */
public class Libri {
    private Libro lista[];
    public Libri(Libro[] lista){
        setLista(lista);
    }
    public Libri(int dimensione){
       lista=new Libro[dimensione];
    }

    public void setLista(Libro[] lista) {
        int dimensione=lista.length;
        lista=new Libro[dimensione];
        this.lista=lista;
    }
    public void addLibro(int i,String titolo, String autore,float prezzo){
        lista[i]=new Libro(titolo, autore, prezzo);
    }
   
}
   

