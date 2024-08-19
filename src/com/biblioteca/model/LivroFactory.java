package com.biblioteca.model;

public interface LivroFactory {
    Livro criarLivro(String titulo, String autor);
}
