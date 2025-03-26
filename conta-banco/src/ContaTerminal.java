import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) {
        // entrada de dados
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Bem-vindo ao sistema de criação de contas bancárias!");

        // Solicitar informações ao usuário
        System.out.println("Digite o número da conta:");
        int numConta = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        int numAgencia = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("Digite o nome do titular da conta:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();

        // Exibir mensagem 
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + numAgencia + ", conta " + numConta +
        " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}