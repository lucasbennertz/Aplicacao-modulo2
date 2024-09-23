package com.mycompany.aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Dieta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cafeManha = new ArrayList<>();
        ArrayList<String> almoco = new ArrayList<>();
        ArrayList<String> jantar = new ArrayList<>();

        // Adicionar itens para café da manhã, almoço e jantar
        adicionarItens("café da manhã", cafeManha, sc); // Pergunta para café da manhã
        adicionarItens("almoço", almoco, sc);           // Pergunta para almoço
        adicionarItens("jantar", jantar, sc);           // Pergunta para jantar

        // Mostra as listas completas
        System.out.println("\nSua lista de dieta:");
        System.out.println("Café da manhã: " + cafeManha);
        System.out.println("Almoço: " + almoco);
        System.out.println("Jantar: " + jantar);
    }

    // Método para adicionar itens a uma lista específica
    public static void adicionarItens(String refeicao, ArrayList<String> lista, Scanner sc) {
        System.out.println("\nVamos adicionar itens à sua lista de " + refeicao + ":");
        while (true) {
            System.out.println("Deseja adicionar um item à lista de " + refeicao + "? (sim/nao)");
            String resposta = sc.nextLine().toLowerCase();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Qual item você quer adicionar?");
                String item = sc.nextLine();
                lista.add(item);
            } else if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {
                break; // Sai do loop
            } else {
                System.out.println("Resposta inválida, por favor, digite 'sim' ou 'não'.");
            }
        }
    }
}
