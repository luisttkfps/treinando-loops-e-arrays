package com.repeticao.parimpar;

import java.util.*;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int par = 0;
		int impar = 0;
		int i = 0;
		
		System.out.println("Quantos numeros deseja verificar?");
		int contador = sc.nextInt();
		
		do {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0) 
				++par;
			else
				++impar;
			
			++i;
		} while(i < contador);
		
		System.out.println("Números pares: " + par);
		System.out.println("Números impares: " + impar);
	}

}
