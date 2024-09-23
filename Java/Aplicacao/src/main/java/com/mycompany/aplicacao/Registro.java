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
                    System.out.println("Insira a sua data de nascimento, apenas em dígitos, no formato DDMMAAAA:");
                    String input = sc.nextLine();
    
                    // Verifica se a entrada tem exatamente 8 dígitos
                    if (input.length() == 8 && input.matches("\\d+")) {
                        try {
                            dtnasc = Double.parseDouble(input); // Tenta converter para double
                            break; // Sai do loop se a conversão for bem-sucedida
                        } catch (NumberFormatException e) {
                            System.out.println("Erro ao converter a data. Por favor, insira um número válido.");
                        }
                    } else {
                        System.out.println("Entrada inválida! A data deve conter exatamente 8 dígitos.");
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
                    String input = sc.next();
                    try {
                        peso = Double.parseDouble(input); // Tenta converter para double
                        break; // Sai do loop se a conversão for bem-sucedida
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida! Por favor, insira um número válido.");
                    }
                }

                altura = altura / 100;
                imc = peso / (altura * altura);

                System.out.println("Seu imc é: "+imc);

            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }

            
        }
    }
}

/* public static void verificaMaiorIdade() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua data de nascimento (DD-MM-YYYY): ");
        String dataNascimento = scanner.nextLine();

        boolean maiorDeIdade = calculaMaiorIdade(dataNascimento);
        
        if (maiorDeIdade) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa não é maior de idade.");
        }

        scanner.close();
    }

    private static boolean calculaMaiorIdade(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate nascimento = LocalDate.parse(dataNascimento, formatter);
            LocalDate hoje = LocalDate.now();
            Period idade = Period.between(nascimento, hoje);
            return idade.getYears() >= 18;
        } catch (DateTimeParseException e) {
            System.out.println("Data de nascimento inválida: " + e.getMessage());
            return false;
        }
    }
 */