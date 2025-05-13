package org.example;

import org.example.geradores.GeradorRelatorio;
import org.example.geradores.GeradorRelatorioDetalhado;
import org.example.geradores.GeradorRelatorioSimples;

public class Main {
    public static void main(String[] args) {


        System.out.println("--- Usando Gerador de Relatório Simples ---");
        GeradorRelatorio geradorSimples = new GeradorRelatorioSimples();
        geradorSimples.executarGeracao();

        System.out.println("\n--- Usando Gerador de Relatório Detalhado ---");

        GeradorRelatorio geradorDetalhado = new GeradorRelatorioDetalhado();
        geradorDetalhado.executarGeracao();
    }
}