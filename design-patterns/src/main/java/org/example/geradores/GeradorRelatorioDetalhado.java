package org.example.geradores;


import org.example.relatorios.Relatorio;
import org.example.relatorios.RelatorioDetalhado;


public class GeradorRelatorioDetalhado extends GeradorRelatorio {
    @Override
    protected Relatorio criarRelatorio() {

        return new RelatorioDetalhado();
    }
}
