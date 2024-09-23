package com.mycompany.aplicacao;

import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double dtnasc;
            double altura;
            double peso;
            double imc = 0.0;

            try {
                // Loop para entrada do data de nascimento
                while (true) {
                    System.out.println("Insira a sua data de nascimento, apenas em dígitos, no formato DMA:");
                    String input = sc.nextLine();
                    if () {
                        System.out.println("");
                    } else {
                        break; // Sai do loop se o nome for válido
                    }
                }

                // Loop para entrada do altura
                while (true) {
                    System.out.println("Insira sua altura em centímetros:");
                    altura = sc.nextDouble();
                    if (altura > 250 || altura < 120) {
                        System.out.println("Erro, altura incoerente.");
                    } else {
                        break; // Sai do loop se a entrada for válida
                    }
                }
                // Loop para entrada do peso
                while (true) {
                    System.out.println("Insira seu peso em kilos:");
                    String input = sc.nextLine();
                    try {
                        peso = Double.parseDouble(input); // Tenta converter para double
                        break; // Sai do loop se a conversão for bem-sucedida
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida! Por favor, insira um número válido.");
                    }
                }

                imc = peso / (altura * altura);

                System.out.println("Seu imc é: "+imc);

            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }
        }
    }
}
