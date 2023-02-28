package com.repeticao.nomeidade;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		String [] nomesAlunos = new String[100];
		int [] idadesAlunos = new int[100];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja informar um novo Aluno? 1 - sim / 0 - não");
		
		int opcao = sc.nextInt();
		while(opcao != 0) {
			if(opcao == 1) {
				System.out.println("Digite o nome do aluno: ");
				nomesAlunos[i] = sc.next();
				System.out.println("Digite a idade do aluno: ");
				idadesAlunos[i] = sc.nextInt();	
			} else {
				for(int j = 0; j < i; j++) {
					System.out.println("============================================================");
					System.out.println("O nome do aluno é " + nomesAlunos[j] + " e ele tem " + idadesAlunos[j]);
					System.out.println(" ");
				}
			}
			++i;
			System.out.println("=== Menu ===");
			System.out.println("0. Sair");
			System.out.println("1. Inserir outro aluno");
			System.out.println("2. Listar");
			opcao = sc.nextInt();
		}
		sc.close();
		System.out.println("Fim");
	}
	
}
