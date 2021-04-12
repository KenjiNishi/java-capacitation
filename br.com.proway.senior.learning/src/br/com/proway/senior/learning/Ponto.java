package br.com.proway.senior.learning;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ponto {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		
		LocalDateTime dataHora;
		DateTimeFormatter forDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dataHoraFormatado;
		
		String entrada = "";
		
		String usuario = "1234";

		while (!entrada.equalsIgnoreCase(usuario)) {

			System.out.println("Insira o cartão:");
			entrada = sc.nextLine();

			if (entrada.equalsIgnoreCase(usuario)) {
				dataHora = LocalDateTime.now();		
				dataHoraFormatado = dataHora.format(forDataHora);
				System.out.println("Usuário identificado!\n"
						+ "Horário da entrada: " + dataHoraFormatado);
				System.out.println();
			} else {
				System.out.println("Usuário não identificado, tente novamente");
			}
		}

		String saida = "";

		while (!saida.equalsIgnoreCase(usuario)) {

			System.out.println("Insira o cartão:");
			saida = sc.nextLine();

			if (saida.equalsIgnoreCase(usuario)) {
				dataHora = LocalDateTime.now();		
				forDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				dataHoraFormatado = dataHora.format(forDataHora);
				System.out.println("Usuário identificado!\n"
						+ "Horário de saída: " + dataHoraFormatado);
			} else {
				System.out.println("Usuário não identificado, tente novamente");
			}
		}

		sc.close();
	}
	// Remember to save the current user status to know if we are doing the first or second register 
	// (So we don't have to specify if we are going in or out)
	
	// refactor in methods
}