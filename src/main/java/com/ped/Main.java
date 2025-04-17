package com.ped;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.ped.model.Candidato;
import com.ped.service.ProvaAvaliationService;
import com.ped.service.TituloAvaliationService;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Candidato> candidatos = new HashMap<>();

        TituloAvaliationService tit = new TituloAvaliationService();
        tit.createAvaliationTitulo("/home/lucas/Downloads/tituloR.txt", candidatos);

        ProvaAvaliationService prov = new ProvaAvaliationService();
        prov.createAvaliationProva("/home/lucas/Downloads/provaR.txt", candidatos);

        try {
            FileWriter writer = new FileWriter("/home/lucas/Downloads/saida.txt");

            for (Candidato c : candidatos.values()) {
                writer.write(c.toString() + "\n");
            }
            writer.close();

        } catch (IOException e) {
            System.err.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}