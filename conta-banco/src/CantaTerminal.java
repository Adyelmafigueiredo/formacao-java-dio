import java.util.Scanner;

public class CantaTerminal {
    public static void main(String[] args) throws Exception {
       //Importa a class scanner
       Scanner scan = new Scanner(System.in);

            //Exibir a mensagem para o usuário
            System.out.println("Digite o seu nome: ");
            //Obter os valores digitados no terminal
            String nomeCliente = scan.nextLine();
            System.out.println("Digite o numero da agencia em que você quer abrir sua caonta: ");
            String agencia = scan.nextLine();
            System.out.println("Digite o número da conta: ");
            int numeroConta = scan.nextInt();
            System.out.println("Digite o valor que você deseja depositar: ");
            double saldo = scan.nextDouble();
            System.out.println("Ola " +nomeCliente + "!");
            System.out.println("Sua agêncina é: " +agencia);
            System.out.println("o número da sua conta é: " +numeroConta);
            System.out.println("Seu saldo em conta R$" +saldo);
    }
}
