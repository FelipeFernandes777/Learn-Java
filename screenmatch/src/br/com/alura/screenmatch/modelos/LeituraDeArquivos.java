package br.com.alura.screenmatch.modelos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Saiba mais
public class LeituraDeArquivos {
    public static void main(String[] args) {
        try {
            File arquivo = new File("filmes.txt");
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
