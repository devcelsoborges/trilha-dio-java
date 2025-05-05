public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    public void exemploMetodo1() {
        System.out.println("Reproduzindo música...");
    }

    public void exemploMetodo2(String exemplo) {
        System.out.println("Tocando faixa: " + exemplo);
    }


    public void exemploMetodo1Telefone() {
        System.out.println("Realizando chamada...");
    }

    public void exemploMetodo2Telefone(String exemplo) {
        System.out.println("Ligando para: " + exemplo);
    }


    public void exemploMetodo1Navegador() {
        System.out.println("Abrindo navegador...");
    }

    public void exemploMetodo2Navegador(String exemplo) {
        System.out.println("Navegando para: " + exemplo);
    }
}
