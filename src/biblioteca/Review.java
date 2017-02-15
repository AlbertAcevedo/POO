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
public class Review {

    private int id;
    private String review;
    ArrayList<Integer> libros;
    ArrayList<Integer> autores;
    ArrayList<String> reviewsl;
    ArrayList<String> reviewsa;

    public Review(int id, String review) {
        this.id = id;
        this.review = review;
    }

    public void setRLibro() {
        libros.add(id);
        reviewsl.add(review);
    }

    public void setRAutor() {
        autores.add(id);
        reviewsa.add(review);
    }

    public ArrayList<Integer> getLibros() {
        return libros;
    }

    public ArrayList<Integer> getAutores() {
        return autores;
    }

    public ArrayList<String> getReviewsl() {
        return reviewsl;
    }

    public ArrayList<String> getReviewsa() {
        return reviewsa;
    }

}
