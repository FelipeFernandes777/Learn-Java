package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.ConexaoApi;
import br.com.alura.screenmatch.modelos.DadosApi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrincipalApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o filme da busca");
        var busca = scanner.nextLine();

        var url = new DadosApi(busca).retornaUrlDaApi();

        ConexaoApi acessoApi = new ConexaoApi(url);

        System.out.println(acessoApi.resultadoDoChamadoAApi());
    }
}