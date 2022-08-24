package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta clienteNormal = new Conta();
		double valor;
		
//		------------------AREA DE CADASTRO
		System.out.printf("Informe o número da conta: ");
		clienteNormal.setNumero(sc.nextInt());
		System.out.printf("Informe o titular da conta: ");
		sc.nextLine();
		clienteNormal.setTitular(sc.nextLine());
		System.out.printf("Deseja realizar um depósito (y/n)? -> ");
		String opc = sc.nextLine();
		
		if(opc.equals("y")) {
			System.out.printf("Informe a quantia para depósito: ");
			valor = sc.nextDouble();
			clienteNormal.depositar(valor);
		}
		System.out.println("\nDADOS DA CONTA:");
		System.out.println(clienteNormal.toString());
		
//		------------------AREA DE DEPÓSITO
		System.out.printf("\nQuantia para depósito: ");
		valor = sc.nextDouble();
		clienteNormal.depositar(valor);
		System.out.println("DADOS ATUALIZADOS DA CONTA:");
		System.out.println(clienteNormal.toString());
		
//		------------------AREA DE SAQUE
		System.out.printf("\nQuantia para depósito: ");
		valor = sc.nextDouble();
		clienteNormal.saque(valor);
		System.out.println("DADOS ATUALIZADOS DA CONTA:");
		System.out.println(clienteNormal.toString());
		
		sc.close();
	}

}