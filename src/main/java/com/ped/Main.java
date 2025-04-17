package com.ped;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

        List<Candidato> listaCandidatos = new ArrayList<>(candidatos.values());
        for (Candidato c : listaCandidatos) {
            c.setTotalPoints();
        }
        listaCandidatos.sort((c1, c2) -> Float.compare(c2.getTotalPoints(), c1.getTotalPoints()));

        int pos = 1;
        for (Candidato c : listaCandidatos) {
            c.setPosition(pos++);
        }

        try {
            FileWriter writer = new FileWriter("/home/lucas/Downloads/out.txt");

            for (Candidato c : listaCandidatos) {
                writer.write(c.toString() + "\n\n");
            }
            writer.close();

        } catch (IOException e) {
            System.err.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}