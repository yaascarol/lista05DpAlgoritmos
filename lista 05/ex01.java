package Ex01;

import java.util.Scanner;

public class ex01 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int senhaCorreta = 1234;
        int tentativas = 3;
        boolean acessoPermitido = false;

        while (tentativas > 0 && !acessoPermitido) {
            System.out.println("Digite a sua senha. (Você tem " + tentativas + " tentativas restantes)");
            int senhaDigitada = scanner.nextInt();
            if (senhaDigitada == senhaCorreta) {
                System.out.println("Acesso permitido");
                acessoPermitido = true;
            } else {
                tentativas--;
                if (tentativas == 0) {
                    System.out.println ("Acesso bloqueado");
                }
            }
        }

        scanner.close();
    }
}