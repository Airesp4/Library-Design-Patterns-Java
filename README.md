# Sistema de Gerenciamento de Biblioteca

Este é um projeto Java que implementa um sistema simples de gerenciamento de biblioteca. O sistema utiliza vários padrões de design, incluindo Singleton, Factory Method, Strategy e Observer.

## Funcionalidades

- **Adicionar livros**: Adicione livros físicos e digitais ao banco de dados.
- **Pesquisar livros**: Pesquise livros por título ou autor usando diferentes estratégias.
- **Notificação de usuários**: Notifique usuários quando um livro reservado estiver disponível.

## Padrões de Projeto Utilizados

1. **Singleton**: Para garantir que o banco de dados de livros tenha apenas uma instância.
2. **Factory Method**: Para criar diferentes tipos de livros (físicos e digitais).
3. **Strategy**: Para implementar diferentes estratégias de pesquisa de livros.
4. **Observer**: Para notificar os usuários quando um livro reservado se tornar disponível.

## Estrutura do Projeto

```plaintext
src/
└── main/
    └── java/
        └── com/
            └── biblioteca/
                ├── BibliotecaApp.java        # Classe principal
                ├── database/
                │   └── LivroDatabase.java     # Implementação do padrão Singleton
                ├── model/
                │   ├── Livro.java             # Modelo de livro
                │   ├── LivroFactory.java      # Interface do Factory Method
                │   ├── LivroFisicoFactory.java# Fábrica de livros físicos
                │   └── LivroDigitalFactory.java# Fábrica de livros digitais
                ├── search/
                │   ├── PesquisaLivroStrategy.java # Interface do Strategy
                │   ├── PesquisaPorTitulo.java # Implementação da pesquisa por título
                │   └── PesquisaPorAutor.java  # Implementação da pesquisa por autor
                └── notification/
                    ├── Observador.java        # Interface do Observer
                    ├── Usuario.java           # Implementação do Observer (Usuário)
                    └── NotificadorLivro.java  # Gerencia as notificações de livros
```

## Conclusão do Projeto

Este projeto foi desenvolvido como parte do desafio do curso de Java na DIO, com o objetivo de praticar e aplicar conceitos de padrões de projeto em um sistema real. Através desse sistema de gerenciamento de biblioteca, foi possível explorar e consolidar o entendimento de padrões como Singleton, Factory Method, Strategy e Observer, que são essenciais para a construção de software modular e escalável.
