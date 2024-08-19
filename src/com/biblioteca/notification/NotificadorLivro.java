package com.biblioteca.notification;

import com.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class NotificadorLivro {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarDisponibilidade(Livro livro) {
        for (Observador observador : observadores) {
            observador.notificar("O livro '" + livro.getTitulo() + "' está disponível.");
        }
    }
}