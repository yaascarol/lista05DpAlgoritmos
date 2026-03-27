import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int somaNotas = 0;
        int quantAvaliacoes = 0;

        System.out.println("Avalie o atendimento de 1 a 5, ou 0 para encerrar: ");
        int nota = scanner.nextInt();

        while (nota != 0){
            if (nota >= 1 && nota <= 5) {
                somaNotas += nota;
                quantAvaliacoes++;
            } else {
                System.out.println("Nota inválida. Digite uma nota de 1 a 5, ou 0 para encerrar: ");
            }

            System.out.println("Avalie o atendimento de 1 a 5, ou 0 para encerrar: ");
            nota = scanner.nextInt();
        }

        if (quantAvaliacoes > 0) {
            double media = somaNotas / quantAvaliacoes;
            System.out.println("Média das avaliações: " + media);
        } else {
            System.out.println("Nenhuma avaliação registrada");
        }

        System.out.println("Total de avaliações: " + quantAvaliacoes);

    }
}
