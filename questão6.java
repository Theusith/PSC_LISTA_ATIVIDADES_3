/*Escreva um programa que peça ao usuário que insira um número de 1 a 4,
correspondendo a cada estação do ano (1 para Primavera, 2 para Verão, 3
para Outono, e 4 para Inverno) para identificar a estação escolhida e
imprimir uma mensagem característica daquela estação.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do{
            System.out.println("Sobre qual estação deseja saber?\n Digite;\n1 para: Verão" +
                    "\n2 para: Outono\n3 para: Primavera\n4 para: Inverno\n5 para: Finalizar");
            num = sc.nextInt();
            switch(num) {
                case 1:
                    System.out.println("É a estação mais quente do ano, tendo os dias mais longos e as noites mais curtas. Possui grande quantidade de chuvas devido à alta evaporação da água acumulada no solo.");
                    break;
                case 2:
                    System.out.println("No geral, várias folhas das árvores caem, e muitas flores se transformam em frutos, servindo de alimento para a fauna da região. É conhecida por ser a estação das frutas.");
                    break;
                case 3:
                    System.out.println("É a estação mais fria do ano. As noites são mais longas e os dias são mais curtos, havendo hibernação de alguns animais.");
                    break;
                case 4:
                    System.out.println("É conhecida como a estação das flores. Nessa estação, as temperaturas ficam mais amenas.");
                    break;
                case 5:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcão invalida");
            }
        }while (num != 5);
        sc.close();
        
    }
}
