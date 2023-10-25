package br.com.alura.screenmatch.exceptions;

public class ErroDeConveraoDeAnoEception extends RuntimeException {
    private String mensagem;
    public ErroDeConveraoDeAnoEception(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
