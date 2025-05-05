public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Venilton");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        Banco banco = new Banco();
        banco.setNome("Banco Digital");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("\nContas registradas no banco:");
        for (Conta conta : banco.getContas()) {
            System.out.println(conta);
        }
    }
}