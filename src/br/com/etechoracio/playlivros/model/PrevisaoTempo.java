package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.enums.CondicaoTempoEnum;
import br.com.etechoracio.playlivros.enums.FaseLuaEnum;

import java.time.LocalDateTime;

public class PrevisaoTempo {
    public String cidade;
    public LocalDateTime data;
    public String resumo;
    public Temperatura temperatura;
    public Vento vento;
    public FaseLuaEnum lua;
    public CondicaoTempoEnum condicao;
    public double probabilidadeChuva;
    public double umidadeMinima;
    public double umidadeMaxima;
}