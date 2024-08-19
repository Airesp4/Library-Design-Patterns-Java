package com.biblioteca.search;

import com.biblioteca.model.Livro;
import java.util.List;

public interface PesquisaLivroStrategy {
    List<Livro> pesquisar(List<Livro> livros, String parametro);
}