package com.biblioteca.search;

import com.biblioteca.model.Livro;
import java.util.List;
import java.util.stream.Collectors;

public class PesquisaPorAutor implements PesquisaLivroStrategy {

    @Override
    public List<Livro> pesquisar(List<Livro> livros, String autor) {
        return livros.stream()
                     .filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
                     .collect(Collectors.toList());
    }
}