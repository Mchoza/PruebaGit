package Cine;

import java.util.Scanner;

public class CinePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int aforo = 100; // Esto es para declarar e inicializar una constante

		int entradas;
		
		Cine cine= new Cine(aforo);
		
		Scanner sc=new Scanner(System.in);
		
		do {
			
			System.out.println("¿Cuántas entradas quieres?");
			entradas=sc.nextInt();
			if (cine.getEntradasDispo()>=entradas) {
				cine.comprarEntradas(entradas);
				if(cine.getEntradasDispo()<20&& cine.getEntradasDispo()!=0) {
					System.out.println("Quedan menos del 20% de entradas");
				}else 
					System.out.println("Muchas gracias por su compra. Se han agotado las entradas");
			}else 
				System.out.println("No hay tantas entradas disponibles");
			
			
			
			
			}while (cine.getEntradasDispo()>0 && cine.cineAbierto());
		
	
		
	}
}
