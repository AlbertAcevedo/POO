/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mybas
 */
public class Biblioteca {

    ArrayList<Libro> libros;
    ArrayList<Autor> autores;
    ArrayList<Usuario> usuarios;
    ArrayList<Review> reviews;

    public Biblioteca() {
        libros = new ArrayList<>();
        autores = new ArrayList<>();
    }

    public void agregarLibro(int id, String titulo) {
        Libro l = new Libro(id, titulo);
        libros.add(l);
    }

    public void agregarAutor(int id, String nombre) {
        Autor a = new Autor(id, nombre);
        autores.add(a);
    }

    public void agregarUsuario(int id) {
        Usuario u = new Usuario(id);
        usuarios.add(u);
    }

    public void agregarUsuario(int id, String nombre) {
        Usuario u = new Usuario(id, nombre);
        usuarios.add(u);
    }

    public void registrarReviewL(Review r, int id, String review) {
        Review rev = new Review(id, review);
        r.setRLibro();
    }
    
        public void registrarReviewA(Review r, int id, String review) {
        Review rev = new Review(id, review);
        r.setRAutor();
    }

    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        String autor;
        System.out.println("Agregue 5 autores");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre:");
            autor = sc.nextLine();
            bib.agregarAutor(i, autor);
        }
        for (int i = 0; i < bib.autores.size(); i++) {
            autor = bib.autores.get(i).getNombre();
            System.out.println(autor);
        }
    }

}
