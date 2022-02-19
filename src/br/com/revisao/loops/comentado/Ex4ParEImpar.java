package br.com.revisao.loops.comentado;

import java.util.Scanner;

// Faça um programa que faça N números inteiros,
// calcule e mostre a quantidade de números pares
// e a quantidade de números ímpares.



public class Ex4ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeDeNumeros;
        int numero;
        int qtdePar = 0, qtdeImpar = 0;
        int somaPar = 0, somaImpar = 0;

        System.out.println("Quantidade de números: ");
        quantidadeDeNumeros = scan.nextInt();


        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count = count + 1;

            if (numero % 2 == 0) {
                qtdePar++;
            } else {
                qtdeImpar++;
            }

            if (numero % 2 == 0) somaPar = somaPar + numero;
            else somaImpar = somaImpar + numero;

        } while (count <= quantidadeDeNumeros);

        System.out.println("Quantidade de números Pares digitados: " + qtdePar);
        System.out.println("Quantidade de números Impares digitados: " + qtdeImpar);
        System.out.println("Soma dos números Pares: " + somaPar);
        System.out.println("Soma dos números Ímpares: " + somaImpar);

    }
}
