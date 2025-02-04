package org.trilhadio;

public class ParametrosInvalidosException {
    private String mensagem;

    public ParametrosInvalidosException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
