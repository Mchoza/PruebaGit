package Cine;

import java.util.Calendar;

//import java.time.LocalDateTime;

public class Cine {

	
	//Atributos de la clase Cine
	
	private int entradasDispo;
	
	//Ver git
	
		// Crear constructor sin parámetros 

		public Cine() {

		}

		// Crear constructor con parametros

		public Cine(int entradasDispo) {
			super();
			this.entradasDispo = entradasDispo;
		}

		public void comprarEntradas (int entradas) {
			entradasDispo-=entradas; //restamos a las entradas disponibles las entradas compradas
			
			
		}
		
		public boolean cineAbierto() {
			int hora;
			Calendar calendario= Calendar.getInstance();
			hora=calendario.get(Calendar.HOUR_OF_DAY);

			if (hora>10 && hora<22) {
				
				return true;
			}else {
				return false;
			}
			
			
			
		}

		public int getEntradasDispo() {
			return entradasDispo;
		}

		public void setEntradasDispo(int entradasDispo) {
			this.entradasDispo = entradasDispo;
		}
		
}