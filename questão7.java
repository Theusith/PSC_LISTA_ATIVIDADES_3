/*Escreva um programa em Java para ler: a descrição do produto (nome),
a quantidade adquirida e o preço unitário. Calcular e escrever o total
(total = quantidade adquirida * preço unitário), o desconto e o total a pagar
(total a pagar = total - desconto), sabendo-se que:
        - Se quantidade <= 5, o desconto será de 2%
        - Se quantidade > 5 e quantidade <=10, o desconto será de 3%
        - Se quantidade > 10 e quantidade <30, o desconto será de 5%
        - Se quantidade >= 30 o desconto será de 10%
        */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeProduto;
        double precoUnitario, desconto;
        int qntdAdquirida;

        System.out.println("Digite o nome do produto:");
        nomeProduto = sc.nextLine();
        System.out.println("Digite a quantidade de produtos adiquiridos:");
        qntdAdquirida = sc.nextInt();
        System.out.println("Digite o preço unitário do produto:");
        precoUnitario = sc.nextDouble();

        double total = qntdAdquirida * precoUnitario;
        System.out.println("O valor total é de: R$" + total);

        if(qntdAdquirida <= 5){
            desconto = 0.02 * total;
            total -= desconto;
            System.out.println("Com desconto irá para: R$" + total);

        } else if (qntdAdquirida > 5 && qntdAdquirida <= 10) {
            desconto = 0.03 * total;
            total -= desconto;
            System.out.println("Com desconto irá para: R$" + total);

        } else if (qntdAdquirida > 10 && qntdAdquirida < 30) {
            desconto = 0.05 * total;
            total -= desconto;
            System.out.println("Com desconto irá para: R$" + total);
        }else{
            desconto = 0.1 * total;
            total -= desconto;
            System.out.println("Com desconto irá para: R$" + total);
            
        }
        sc.close();
        
    }
}
