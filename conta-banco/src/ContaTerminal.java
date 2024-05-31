import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //declaração de variavel 
        String nomeCliente;
        String agencia;
        int numero;
        double saldo;

        //TO DO: conhecer e importa a classe scanner
        Scanner scanner = new Scanner (System.in);

        //exiber as mensagens para o usuário
        System.out.println("###### Bem Vindo ao Banco DIO ######");
        System.out.println();
        System.out.print("Por favor, digite o numero da Agencia: ");
        agencia = scanner.nextLine();
        System.out.println();
        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.println();
        System.out.print("Digite o numero da conta: ");
        numero = scanner.nextInt();
        System.out.println();
        System.out.print("Por favor digite, o saldo inicial: ");
        saldo = scanner.nextDouble();
        System.out.println();
        System.out.println("###########################################################");
        

        //exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ",sua conta " + numero + " e seu saldo R$ " + saldo + " já está disponivel para saque");
        System.out.println();
        System.out.println("########################### Fim da Transação ################################");

    }
}
