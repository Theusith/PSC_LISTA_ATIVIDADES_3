/*A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela:
Idade (anos)
Classificação
menor que 16
Não é eleitor
de 16 a 17
Eleitor facultativo
de 18 a 65
Eleitor obrigatório
acima de 65
Eleitor facultativo
Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String eleitorNulo = "Não é eleitor.";
        String eleitorFacultativo = "Eleitor Facultativo.";
        String eleitorObrigatorio = "Eleitor Obrigatório.";

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();

        if(idade < 16){
            System.out.println(eleitorNulo);
        } else if (idade >= 16 && idade < 18){
            System.out.println(eleitorFacultativo);
        } else if (idade >= 18 && idade <=65) {
            System.out.println(eleitorObrigatorio);
        }else{
            System.out.println(eleitorFacultativo);
        }

        sc.close();

    }
}
