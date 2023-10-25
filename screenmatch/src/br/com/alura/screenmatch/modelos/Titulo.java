package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exceptions.ErroDeConveraoDeAnoEception;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo ( String nome, int anoDeLancamento ) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }
    public Titulo ( TituloOmdb meuTituloOmdb ) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConveraoDeAnoEception("Não consegui converter o ano" +
                    " porque tem mais de 04 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getNome () {
        return this.nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public void exibeFichaTecnica () {

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento do filme: " + anoDeLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos + " minutos");
        System.out.println("Sua nota é: " + somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
    }

    public void avaliaFilme(double notaDoFilme){
        somaDasAvaliacoes += notaDoFilme;
        totalDeAvaliacoes++;
    }

    public double obterMediaDasAvaliacoes(){
        double mediaDasNotas = somaDasAvaliacoes / totalDeAvaliacoes;
        return mediaDasNotas;
    }

    @Override
    public int compareTo ( Titulo outroTitulo ) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString ( ) {
        return "Title: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")" + "," + "duração: " + duracaoEmMinutos;
    }
}
