import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalVendido = 0;
        int quantidadePedidos = 0;

        while (true) {
            System.out.print("Valor: ");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                continue;
            }

            if (valor == 0) {
                break;
            }

            totalVendido += valor;
            quantidadePedidos++;
        }

        if (quantidadePedidos > 0) {
            System.out.println("Total vendido: " + totalVendido);
            System.out.println("Quantidade de pedidos: " + quantidadePedidos);
        } else {
            System.out.println("Nenhum pedido válido registrado");
        }

    }
}
