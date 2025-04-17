package com.ped;

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

    }
}