package com.ped.service;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import com.ped.model.Candidato;

public class ProvaAvaliationService {
    public ProvaAvaliationService() {
    }

    public void createAvaliationProva(String path, Map<Integer, Candidato> candidatosMap) {
        try {
            File arquivo = new File(path);
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] colunas = linha.trim().split("\\s+");

                if (colunas.length >= 11) {
                    Integer id = Integer.parseInt(colunas[0]);
                    String firstName = colunas[1];
                    String secondName = colunas[2];
                    String lastName = colunas[3];
                    // String typeInscription = colunas[colunas.length - 9];
                    String lpfs = colunas[colunas.length - 8];
                    String rlfs = colunas[colunas.length - 7];
                    String cped = colunas[colunas.length - 6];
                    String cepe = colunas[colunas.length - 5];
                    String provaPts = colunas[colunas.length - 4];

                    String name = firstName + " " + secondName + " " + lastName;
                    Candidato candidato = candidatosMap.getOrDefault(id, new Candidato());// busca um candidato, caso
                                                                                          // exista ele retorna o obj,
                                                                                          // caso n exista ele cria um
                                                                                          // novo obj(mas n salva no
                                                                                          // map)
                    boolean exist = candidatosMap.containsKey(id);
                    if (!exist) {
                        candidato.setId(id);
                        candidato.setName(name);
                    } else {
                        candidato.setPtsLpfs(lpfs);
                        candidato.setPtsRlfs(rlfs);
                        candidato.setPtsCped(cped);
                        candidato.setPtsCepe(cepe);
                        candidato.setTotalPtsProva(provaPts);
                    }
                }

            }

            scanner.close();
        } catch (IOException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());

        }

    }

}