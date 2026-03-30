package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;

import java.time.LocalTime;

public class CarrinhoCompras
{
    static void main() {
        Livro primeiroLivro = new Livro();
        primeiroLivro.titulo = "O Poder do Hábito";
        primeiroLivro.autor = "Charles Duhigg";
        primeiroLivro.narrador = "Carlos Seidl";
        primeiroLivro.editora = "Objetiva";
        primeiroLivro.duracao = LocalTime.of(10, 45);
        primeiroLivro.versaO = VersaoEnum.RESUMIDA;
        primeiroLivro.preco = 29.90;
        primeiroLivro.resumo = "Explora como os hábitos funcionam e como podem ser transformados.";
    }
}
