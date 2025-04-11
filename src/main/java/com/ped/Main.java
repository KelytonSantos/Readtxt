package com.ped;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File arquivo = new File("/home/lucas/Downloads/Lista-pedag.txt");
            Scanner scanner = new Scanner(arquivo);

            // pula a primeira linha (cabeçalho)
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();

                // Remove espaços múltiplos e separa por espaço
                String[] colunas = linha.trim().split("\\s+");
                // .trim remove os espaços do final caso exista
                // .split("\\s+") dividi a linha em pedaços
                // (\\s+) divide onde tiver 1 ou mais espaços/tabs

                if (colunas.length >= 6) { // deve ter pelo menos 6 colunas
                    String pontos = colunas[colunas.length - 1]; // última coluna
                    String esp = colunas[colunas.length - 2];
                    String dout = colunas[colunas.length - 3];
                    System.out.println("DOUT " + dout + " ESP " + esp + " PONTOS: " + pontos);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}