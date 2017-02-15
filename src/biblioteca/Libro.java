/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author mybas
 */
public class Libro {

    private Autor autor;
    private String titulo;
    private int id;

    public Libro(int id, String titulo) {
        this.titulo = titulo;
        this.id = id;
    }

    public Autor getAutor() {
        return autor;
    }


    public String getTitulo() {
        return titulo;
    }
/*
    Las siguientes subrutinas asingan un autor/titulo en caso de que AÚN no exista uno.
    */
    public void setAutor(Autor autor) {
        if(this.autor==null){
        this.autor = autor;
        }
    }

    public void setTitulo(String titulo) {
        if (this.titulo==null) {
            this.titulo = titulo;
        }
    }
    /*
    Estas son las subrutinas originales
    */
//    public boolean setTitulo(String titulo) {
//        if (this.titulo == null) {
//            this.titulo = titulo;
//            return true;
//        }
//    public boolean setAutor(Autor autor) {
//        if (this.autor == null) {
//            this.autor = autor;
//            return true;
//        }
//        return false;
//    }

}
