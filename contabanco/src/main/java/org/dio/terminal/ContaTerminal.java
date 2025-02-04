import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine();
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        String saldoStr = scanner.nextLine().replace(",", ".");
        double saldo = Double.parseDouble(saldoStr);

        // Exibir a mensagem final formatada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}
