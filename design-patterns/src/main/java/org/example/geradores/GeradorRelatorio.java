package org.example.geradores;


import org.example.relatorios.Relatorio;

public abstract class GeradorRelatorio {

    protected abstract Relatorio criarRelatorio();

    public void executarGeracao() {
        Relatorio relatorio = criarRelatorio();
        System.out.println("Preparando para gerar o relatório...");
        relatorio.gerar();
        System.out.println("Geração concluída.");
    }
}
