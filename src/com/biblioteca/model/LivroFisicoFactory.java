package com.biblioteca.model;

public class LivroFisicoFactory implements LivroFactory {

    @Override
    public Livro criarLivro(String titulo, String autor) {
        return new Livro(titulo, autor, "Físico");
    }
}