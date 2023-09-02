import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        System.out.print("Informe o seu nome: ");
        conta.nome = input.next();

        System.out.print("Informe o número da agência: ");
        conta.agencia = input.next();

        System.out.print("Informe o número da conta: ");
        conta.numero = input.nextInt();

        System.out.print("Deposite seu dinheiro: ");
        conta.saldo = input.nextDouble();

        System.out.print("Olá ".concat(conta.nome));
        System.out.print(", obrigado por criar uma conta em nosso banco, sua agência é ".concat(conta.agencia));
        System.out.print(", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");

        input.close();
    }
}