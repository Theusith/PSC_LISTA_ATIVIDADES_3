//Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. O algoritmo deverá seguir todas as regras da divisão de números reais.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3, media;

        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextFloat();

        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextFloat();

        System.out.println("Digite a terceira nota:");
        nota3 = sc.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7 ){
            System.out.printf("\nA média das notas é: %.2f\nAluno aprovado!", media);
        }else{
            System.out.print("\nA média das notas é: %.2f\nAluno reprovado!");
        }
      sc.close();
      
    }
