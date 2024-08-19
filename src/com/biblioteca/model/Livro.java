package com.biblioteca.model;

public class Livro {
    private String titulo;
    private String autor;
    private String tipo;

    public Livro(String titulo, String autor, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}