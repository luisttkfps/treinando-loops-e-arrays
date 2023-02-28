package com.repeticao.maiormedia;

import java.util.Scanner;

public class MaiorMedia {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			int maior;
			System.out.println("Informe o primeiro número");
			int num1 = sc.nextInt();
			maior = num1;
			System.out.println("Informe o segundo número");
			int num2 = sc.nextInt();
			maior = TestarMaior(maior, num2);
			System.out.println("Informe o terceiro número");
			int num3 = sc.nextInt();
			maior = TestarMaior(maior, num3);
			System.out.println("Informe o quarto número");
			int num4 = sc.nextInt();
			maior = TestarMaior(maior, num4);
			System.out.println("Informe o quinto número");
			int num5 = sc.nextInt();
			maior = TestarMaior(maior, num5);
			
			double media = (num1 + num2 + num3 + num4 + num5) / 5;
			
			System.out.println("O numero maior é: " + maior);
			System.out.println("A media é: " + media);
		} while(true);
			
	}
	
	public static int TestarMaior(int maior, int alvo) {
		int resultado;
		return alvo > maior ? (resultado = alvo) : (resultado = maior);
	}


}
