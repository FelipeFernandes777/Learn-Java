package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exceptions.ErroDeConveraoDeAnoEception;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoApi {
    private String uri;

    public ConexaoApi(String url) {
        this.uri = url;
    }

    public String resultadoDoChamadoAApi() throws IOException, InterruptedException {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println("Json: " + json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println(meuTitulo);

            FileWriter escrita = new FileWriter( "filmes.txt");
            escrita.write(meuTitulo.toString());
            escrita.close();

        } catch (NumberFormatException error) {
            System.out.println("Aconteceu um error: " + error.getMessage());
        } catch (IllegalArgumentException error) {
            System.out.println("Algum error de argumento está invalido na busca: " + error.getMessage());
        } catch (ErroDeConveraoDeAnoEception error) {
            System.out.println(error.getMessage());
        }
        return "";
    }

}
