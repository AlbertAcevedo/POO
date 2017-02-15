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
public class Autor {

    private int id;
    private String nombre;
    ArrayList<Libro> libros;

    public Autor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        libros = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {
        if (this.nombre == null) {
            this.nombre = nombre;
            return true;
        }
        return false;
    }

}
