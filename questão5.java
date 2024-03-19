/*Escreva um programa em Java para determinar se o indivíduo está com um peso favorável.
Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida
pela equação: IMC = pesoaltura2. A situação do peso é determinada pela tabela abaixo:*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura, imc;
        int peso;

        System.out.println("Digite a sua altura em centimetros: ");
        altura = sc.nextFloat();

        altura = altura/100;

        System.out.println("Digite a o seu peso: ");
        peso = sc.nextInt();

        imc = (float) peso / (altura*altura);

        System.out.printf("O seu imc é: %.2f", imc);

        if(imc < 20){
            System.out.println("\nVocê está abaixo do peso!");
        } else if (imc < 25) {
            System.out.println("Você está com peso normal!");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso!");
        } else if (imc < 40) {
            System.out.println("Você está obeso!");
        } else{
            System.out.println("Você tem Obesidade morbida!");
        }

        sc.close();

    }

}
