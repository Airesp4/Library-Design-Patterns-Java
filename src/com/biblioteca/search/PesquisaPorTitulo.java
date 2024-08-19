package com.biblioteca.search;

import com.biblioteca.model.Livro;
import java.util.List;
import java.util.stream.Collectors;

public class PesquisaPorTitulo implements PesquisaLivroStrategy {

    @Override
    public List<Livro> pesquisar(List<Livro> livros, String titulo) {
        return livros.stream()
                     .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
                     .collect(Collectors.toList());
    }
}
