import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int acessosPermitidos = 0;
        int acessosNegados = 0;

        System.out.println("Digite a idade dos alunos (digite -1 para encerrar):");
        int idade = scanner.nextInt();

        while (idade != -1) {
            if (idade >= 16) {
                System.out.println("Acesso permitido");
                acessosPermitidos++;
            } else if (idade != -1) {
                System.out.println("Acesso negado");
                acessosNegados++;
            }
            
            System.out.println("Digite a idade dos alunos (digite -1 para encerrar):");
            idade = scanner.nextInt();
        }

        System.out.println("Total de acessos permitidos: " + acessosPermitidos);
        System.out.println("Total de acessos negados: " + acessosNegados);
    }
}
