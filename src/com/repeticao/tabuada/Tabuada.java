package com.repeticao.tabuada;

import java.util.*;

public class Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorTabuada;
		String opcao;
		do {
			System.out.println("De qual número você deseja visualizar a tabuada? ");
			valorTabuada = sc.nextInt();

			for(int i = 0; i <= 10; i++) {
				System.out.println(valorTabuada + " x " + i + " = " + (valorTabuada*i));
			}
			System.out.println("Deseja ver outra tabuada? S / N");
			opcao = sc.next();
		}while(opcao.equals("s"));
		
		System.out.println("Fim...");
		
		
	}
}
