package com.ped.service;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import com.ped.model.Candidato;

public class TituloAvaliationService {

    public TituloAvaliationService() {
    }

    public void createAvaliationTitulo(String path, Map<Integer, Candidato> candidatosMap) {
        try {
            File arquivo = new File(path);

            Scanner scanner = new Scanner(arquivo);

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

                if (colunas.length >= 8) {
                    String pontos = colunas[colunas.length - 1]; // última coluna
                    String esp = colunas[colunas.length - 2];
                    String mest = colunas[colunas.length - 3];
                    String dout = colunas[colunas.length - 4];
                    String firstName = colunas[1];
                    String secondName = colunas[2];
                    String lastName = colunas[3];
                    Integer id = Integer.parseInt(colunas[0]);

                    String name = firstName + " " + secondName + " " + lastName;

                    Candidato candidato = candidatosMap.getOrDefault(id, new Candidato());

                    boolean exist = candidatosMap.containsKey(id);
                    if (!exist) {
                        candidato.setId(id);
                        candidato.setName(name);
                    } else {
                        candidato.setPtsEsp(esp);
                        candidato.setPtsMest(mest);
                        candidato.setPtsDout(dout);
                        candidato.setTotalPtsTitulo(pontos);
                    }

                }

            }

            scanner.close();

        } catch (IOException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}

/*
 * for (int i = 0; i < candidatos.size(); i++) {
 * candidatos.get(i).setPosition(i + 1); // A posição começa de 1
 * }*
 * 
 * FileWriter writer = new FileWriter("/home/lucas/Downloads/saida.txt");
 * for (Candidato c : candidatos) {
 * writer.write(c.toString() + "\n");
 * }
 * writer.close();
 * 
 */