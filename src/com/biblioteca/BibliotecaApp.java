package com.biblioteca;

import com.biblioteca.database.LivroDatabase;
import com.biblioteca.model.Livro;
import com.biblioteca.model.LivroDigitalFactory;
import com.biblioteca.model.LivroFisicoFactory;
import com.biblioteca.notification.NotificadorLivro;
import com.biblioteca.notification.Usuario;
import com.biblioteca.search.PesquisaPorAutor;
import com.biblioteca.search.PesquisaPorTitulo;

import java.util.List;

public class BibliotecaApp {
    public static void main(String[] args) {
        LivroDatabase db = LivroDatabase.getInstance();

        LivroFisicoFactory fisicoFactory = new LivroFisicoFactory();
        LivroDigitalFactory digitalFactory = new LivroDigitalFactory();

        Livro livro1 = fisicoFactory.criarLivro("Java para Iniciantes", "John Doe");
        Livro livro2 = digitalFactory.criarLivro("Padrões de Projeto em Java", "Jane Doe");

        db.adicionarLivro(livro1);
        db.adicionarLivro(livro2);


        PesquisaPorTitulo pesquisaPorTitulo = new PesquisaPorTitulo();
        List<Livro> resultadoTitulo = pesquisaPorTitulo.pesquisar(db.getLivros(), "Java para Iniciantes");
        System.out.println("Pesquisa por Título: " + resultadoTitulo);


        PesquisaPorAutor pesquisaPorAutor = new PesquisaPorAutor();
        List<Livro> resultadoAutor = pesquisaPorAutor.pesquisar(db.getLivros(), "Jane Doe");
        System.out.println("Pesquisa por Autor: " + resultadoAutor);


        NotificadorLivro notificador = new NotificadorLivro();
        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bob");

        notificador.adicionarObservador(usuario1);
        notificador.adicionarObservador(usuario2);

        notificador.notificarDisponibilidade(livro1);
    }
}

