//Escreva um programa em Java para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalEleitores, votosBrancos, votosNulos, votosValidos;
        float percentualVotosBrancos, percentualVotosValidos, percentualVotosNulos;

        System.out.println("Digite o numero total de eleitores:");
        totalEleitores = sc.nextInt();

        System.out.println("Digite o numero de votos brancos:");
        votosBrancos = sc.nextInt();

        System.out.println("Digite o numero de votos nulos:");
        votosNulos = sc.nextInt();

        percentualVotosBrancos = (votosBrancos * 100)/ totalEleitores;
        percentualVotosNulos = (votosNulos * 100) / totalEleitores;
        percentualVotosValidos = (votosValidos * 100) / totalEleitores;

        System.out.println("Votos brancos: " + percentualVotosBrancos + "%" );
        System.out.println("Votos nulos: " + percentualVotosNulos + "%");
        System.out.println("Votos validos: " + percentualVotosValidos + "%");
      
        sc.close();


    }

}
