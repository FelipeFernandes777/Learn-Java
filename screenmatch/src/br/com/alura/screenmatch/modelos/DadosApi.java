package br.com.alura.screenmatch.modelos;

public class DadosApi {

    private String busca;
    private String endereco = "https://www.omdbapi.com/?t=";
    private String apiKey = "&apikey=6585022c";

    public DadosApi(String busca) {
        this.busca = busca;
    }

    public String retornaUrlDaApi() {
        return this.endereco + this.busca.replace(" ", "+") + this.apiKey;
    }
}
