package com.repeticao.fatorial;

import java.util.*;
public class Fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor = 0;
		
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		
		valor = numero;
		
		for(int i = 1; i < numero; i++) {
			valor *= numero - i;
			System.out.println(numero + " * " + (numero - i) + " = " + valor);
		}
	}
}
