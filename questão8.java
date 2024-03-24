/*Você está trabalhando em uma startup voltada para educação, e ficou responsável
por criar a lógica de uma das atividades. Seu programa deve receber o valor dos
três lados de um triângulo, e informar se ele é equilátero, isósceles ou escaleno.
Restrição: Em um triângulo, o comprimento de um lado é sempre menor do que a soma
dos outros dois!
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ladoA, ladoB, ladoC;
        System.out.println("Digite o valor do lado A:");
        ladoA = sc.nextInt();

        System.out.println("Digite o valor do lado B:");
        ladoB = sc.nextInt();

        System.out.println("Digite o valor do lado C:");
        ladoC = sc.nextInt();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA){
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.println("O triangulo é Equilátero!");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                System.out.println("O triangulo é Isósceles!");
            }else{
                System.out.println("O triangulo é Escaleno!");
            }
        }else{
            System.out.println("O triangulo não existe!");
        }
        sc.close();

    }
}
