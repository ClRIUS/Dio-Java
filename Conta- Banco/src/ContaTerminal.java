import java.util.Scanner;
import java.text.MessageFormat;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta"); //Número da conta
        int conta = sc.nextInt();
        
        System.out.println("Por favor, digite o número da Agencia"); //Número da Agência
        String agencia = sc.next();
        
        System.out.println("Por favor, digite seu Nome"); //Nome do cliente
        String nomeCliente = sc.next();
        
        System.out.println("Por favor, insira seu saldo atual"); //Saldo em conta
        double saldo = sc.nextDouble();

        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.2f ja esta disponivel para saque", nomeCliente, agencia, conta, saldo);
    }
}
