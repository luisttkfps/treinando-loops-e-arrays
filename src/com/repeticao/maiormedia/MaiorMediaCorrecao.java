package com.repeticao.maiormedia;

import java.util.Scanner;

public class MaiorMediaCorrecao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		int maior = 0;
		int soma = 0;
		do {
			System.out.println("Informe o numero: ");
			numero = sc.nextInt();
			if(numero > maior) maior = numero;
			
			soma += numero;
	
			contador++;
		}while(contador < 5);
		System.out.println("Media: " + (soma/contador));
		System.out.println("Maior: " + maior);
	}
}
