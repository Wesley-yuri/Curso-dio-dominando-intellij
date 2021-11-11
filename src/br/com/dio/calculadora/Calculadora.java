package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a,b;

        System.out.println("digite o primeiro numero: ");
        a = scan.nextInt();
        System.out.println("digite o segundo numero: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtracao = subtracao(a, b);
        int multiplicacao = multiplicacao(a,b);
        float divisao = divisao(a,b);

        System.out.println("Somar: " + somar);
        System.out.println("subtrair: " + subtracao);
        System.out.println("multiplicacao: " + multiplicacao);
        System.out.println("divisão: " + divisao);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static float divisao(float a, float b) {
        return a / b;
    }
}
