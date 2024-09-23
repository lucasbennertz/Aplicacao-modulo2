package com.mycompany.aplicacao;
import java.util.Scanner;

public class Aplicacao {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String nome = "";
            String telefone = "";
            String CPF = "";
            String email = "";

            try {
                // Loop para entrada do nome
                while (true) {
                    System.out.println("Insira o seu nome:");
                    nome = sc.nextLine();
                    if (!campoAlfabetico(nome)) {
                        System.out.println("Nome deve conter apenas letras. Tente novamente.");
                    } else {
                        break; // Sai do loop se o nome for válido
                    }
                }

                // Loop para entrada do telefone
                while (true) {
                    System.out.println("Insira seu número de telefone (apenas números):");
                    telefone = sc.nextLine();
                    if (!campoNumerico(telefone) || telefone.length() < 10 || telefone.length() > 11) {
                        System.out.println("Erro: Você deve inserir um número de telefone válido (10 ou 11 dígitos). Tente novamente.");
                    } else {
                        break; // Sai do loop se a entrada for válida
                    }
                }

                // Loop para entrada do CPF
                while (true) {
                    System.out.println("Insira seu número de CPF (apenas números):");
                    CPF = sc.nextLine();
                    if (!campoNumerico(CPF) || CPF.length() != 11) {
                        System.out.println("Erro: Você deve inserir um número de CPF válido (11 dígitos). Tente novamente.");
                    } else {
                        break; // Sai do loop se a entrada for válida
                    }
                }

                // Loop para entrada do email
                while (true) {
                    System.out.println("Insira seu email:");
                    email = sc.nextLine();
                    if (!campoEmail(email)) {
                        System.out.println("Erro: Email inválido. Tente novamente.");
                    } else {
                        break; // Sai do loop se o email for válido
                    }
                }

                System.out.println("Seja bem-vindo " + nome);

            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }
        }
    }

    private static boolean campoAlfabetico(String campo) {           
        return campo.matches("[A-Za-zÇç]+");
    }

    private static boolean campoNumerico(String campo) {
        return campo.matches("\\d+"); // Verifica se contém apenas dígitos
    }

    private static boolean campoEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$"); // Regex para permitir domínios variados
    }
}
