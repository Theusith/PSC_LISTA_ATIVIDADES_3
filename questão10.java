/*Na lojinha do Sr. Aboo, encontramos produtos de informática com preços especiais.
Mas o Sr. Aboo segue uma receita de seus antepassados para acrescentar uma porcentagem
sobre o valor de custo do produto, garantindo assim, a estabilidade financeira das
futuras gerações de sua família. A tabela abaixo, feita pelo avô do Sr. Aboo, descreve o
valor do lucro de um produto, considerando o valor de compra do mesmo.
Para auxiliar o Sr. Aboo, codifique um programa que leia o valor da compra de um produto
de informática e imprima a porcentagem do lucro e o valor da venda.  O programa deve exibir a
mensagem "Lojinha do Sr. Aboo" e em seguida solicitar o valor da compra com o fornecedor, e, em
seguida, exibir qual será a porcentagem de lucro e o valor que o item deve ser colocado para venda.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorCompra, valorVenda;

        System.out.println("Lojinha do Sr. Aboo");
        System.out.println("Qual o valor da compra com o fornecedor?");
        valorCompra = sc.nextDouble();
        if ( valorCompra < 10.00){
            valorVenda = valorCompra*0.7 + valorCompra;
            System.out.println("O iten será vendido a R$ "+ valorVenda + ", com o lucro de 70%");
        } else if (valorCompra >= 10 && valorCompra < 30) {
            valorVenda = valorCompra*0.5 + valorCompra;
            System.out.println("O iten será vendido a R$ "+ valorVenda + ", com o lucro de 50%");
        } else if (valorCompra >= 10 && valorCompra < 50) {
            valorVenda = valorCompra*0.4 + valorCompra;
            System.out.println("O iten será vendido a R$ "+ valorVenda + ", com o lucro de 40%");
        }else {
            valorVenda = valorCompra*0.4 + valorCompra;
            System.out.println("O iten será vendido a R$ "+ valorVenda + ", com o lucro de 30%");
        }
        sc.close();

    }
}
