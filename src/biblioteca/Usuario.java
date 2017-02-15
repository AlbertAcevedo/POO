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
public class Usuario {

    ArrayList<Libro> libros;
    ArrayList<Review> reviews;
    private int id;
    private String nombre;

    public Usuario(int id) {
        this.id = id;
        libros = new ArrayList<>();
        reviews = new ArrayList<>();
    }

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        libros = new ArrayList<>();
        reviews = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
