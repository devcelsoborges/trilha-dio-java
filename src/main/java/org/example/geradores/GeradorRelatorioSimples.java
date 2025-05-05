package org.example.geradores;

import org.example.relatorios.Relatorio;
import org.example.relatorios.RelatorioSimples;


public class GeradorRelatorioSimples extends GeradorRelatorio {
    @Override
    protected Relatorio criarRelatorio() {

        return new RelatorioSimples();
    }
}
