/*Crie um programa para exibir o menu de um caixa eletrônico.
Ele deve possuir as opções: Exibir saldo, Exibir extrato,
Realizar depósito, Realizar saque, e Sair. Se alguma opção inválida for
fornecida, exiba uma mensagem de erro e saia do programa. Observação:
Utilize a estrutura de seleção Switch/Case para implementar seu produto.
Utilize números inteiros para indicar cada opção.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("-------- Caixa eletrônico--------");
        System.out.println(" ");
        System.out.println("Digite:\n1 - Para exibir o saldo");
        System.out.println("2 - Para extrato");
        System.out.println("3 - Para realizar depósito");
        System.out.println("4 - Para realizar saque");
        System.out.println("5 - para sair");

        opcao = sc.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Exibir saldo");
                break;

            case 2:
                System.out.println("Exibir extrato");
                break;

            case 3:
                System.out.println("Saldo realizado");
                break;

            case 4:
                System.out.println("Depósito realizado");
                break;

            case 5:
                System.out.println("Operação finalizada");

            default:
                System.out.println("Opção inválida. Operação finalizada. \nTente novamente");
        }

    }
}
