package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.Enums.VersaoEnum;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;

public class Livro {
    public String titulo;
    public String autor;
    public LocalTime duracao;
    public String resumo;
    public double preco;
    public String editora;
    public String narrador;
    public VersaoEnum versao;

    public void exibir() {
        System.out.println("--------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Narrador: " + narrador);
        System.out.println("Editora: " + editora);
    }
}
