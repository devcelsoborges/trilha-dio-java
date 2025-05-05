package org.trilhadio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        ParametrosInvalidosException erro = validarParametros(parametroUm, parametroDois);

        if (erro != null) {
            System.out.println(erro.getMensagem());
        } else {
            contar(parametroUm, parametroDois);
        }

        terminal.close();
    }

    static ParametrosInvalidosException validarParametros(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            return new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        return null;
    }
    
    static void contar(int parametroUm, int parametroDois) {
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
