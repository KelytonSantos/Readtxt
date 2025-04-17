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

            scanner.close();
        } catch (IOException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());

        }

    }

}