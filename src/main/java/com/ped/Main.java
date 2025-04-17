package com.ped;

import com.ped.service.TituloAvaliationService;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        TituloAvaliationService tit = new TituloAvaliationService();
        tit.createAvaliationTitulo();
    }
}