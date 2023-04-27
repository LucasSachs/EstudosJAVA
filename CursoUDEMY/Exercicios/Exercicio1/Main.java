package CursoUDEMY.Exercicios.Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a quantidade de produtos desejada: ");
        int qtdProdutos = sc.nextInt();

        Produto[] arrayProdutos = new Produto[qtdProdutos];
        Double media = 0.0;

        for(int i = 0; i < arrayProdutos.length; i++) {
            sc.nextLine();

            System.out.println("Digite o nome do produto: ");
            String nomeProduto = sc.nextLine();

            System.out.println("Digite o valor do produto: ");
            Double valorProduto = sc.nextDouble();

            arrayProdutos[i] = new Produto(valorProduto, nomeProduto);
            media += arrayProdutos[i].getPreco();

            System.out.println("Produto registrado com sucesso!");
        }

        System.out.printf("O valor da media eh: R$%.2f", media / arrayProdutos.length);

        sc.close();
    }
}
