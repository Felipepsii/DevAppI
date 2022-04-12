

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\Aluno\\Documents\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		double totalA = 0;
		double totalB = 0;
		double totalC = 0;
		double totalD = 0;
		double totalE = 0;
		double totalF = 0; 
		
		double total = 0;
		
		while(leitor.hasNext()) {
		
			
			String linha = leitor.nextLine();
			String[] dadoslinha = linha.split("\t");
		/*	System.out.println("Grupo: " + dadoslinha[0]);
			System.out.println("Valor: " + dadoslinha[1]);
			System.out.println("--------------"); */
			
			
			switch (dadoslinha[0]) {
			case "A":
				totalA += getValor(dadoslinha[1]);
				break;
			case "B":
				totalB += getValor(dadoslinha[1]);
				break;
			case "C":
				totalC += getValor(dadoslinha[1]);
				break;
			case "D":
				totalD += getValor(dadoslinha[1]);
				break;
			case "E":
				totalE += getValor(dadoslinha[1]);
				break;
			case "F":
				totalF += getValor(dadoslinha[1]);
				break;

		}
		
		printGrupo("A", totalA);
		printGrupo("B", totalB);
		printGrupo("C", totalC);
		printGrupo("D", totalD);
		printGrupo("E", totalE);
		printGrupo("F", totalF);

		
		total = totalA + totalB + totalC + totalD + totalE + totalF;
		
		System.out.println("Total Geral: " + total);
		
		
			leitor.close();	}	
		}
	
	public static double getValor(String vlr) {
	return Double.parseDouble(vlr);
}

	public static void printGrupo(String letra, double vlr) {
		System.out.println("Total Grupo " + letra + " :" + vlr);

	}
	
}

