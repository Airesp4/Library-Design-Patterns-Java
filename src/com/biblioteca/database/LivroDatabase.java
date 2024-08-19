package com.biblioteca.database;

import com.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroDatabase {
    private static LivroDatabase instancia;
    private List<Livro> livros;

    private LivroDatabase() {
        livros = new ArrayList<>();
    }

    public static synchronized LivroDatabase getInstance() {
        if (instancia == null) {
            instancia = new LivroDatabase();
        }
        return instancia;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public List<Livro> getLivros() {
        return new ArrayList<>(livros);
    }
}

