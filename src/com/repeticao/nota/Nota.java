package com.repeticao.nota;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota = 0;
		System.out.println("Nota: ");
		nota = sc.nextInt();
		
		while((nota < 0) || (nota > 10)) {
			System.out.println("Informe uma nota válida entre 0 e 10!");
			nota = sc.nextInt();

		}
		
		System.out.println("Fim...");

	}

}
