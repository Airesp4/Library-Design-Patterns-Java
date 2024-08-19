package com.biblioteca.notification;

public class Usuario implements Observador {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(nome + " recebeu notificação: " + mensagem);
    }
}