package Atleta;

import java.util.Scanner;

public class AtletaPrueba {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		Atleta atleta[] = new Atleta[2];
		
		for (int i=0; i<atleta.length; i++) {
			
			System.out.println("Introduce Nombre del atleta");
			String nombre = entrada.nextLine();
			
			System.out.println("Introduce su dni");
			String dni = entrada.nextLine();
			
			
			System.out.println("Introduce año de nacimiento");
			int año = entrada.nextInt();
			
			System.out.println("Introduce altura");
			float altura = entrada.nextFloat();
			
			System.out.println("Introduce peso");
			int peso = entrada.nextInt();
			
			int sara = 0;
			boolean estudia = true;
			while (sara == 0) {
				System.out.println("Estudia o no, si estudias di s, si no estudias di n");
				char estudio = entrada.next().charAt(0);
				if (estudio == 's') {
					estudia = true;
					break;
				} 
				if (estudio == 'n') {
					estudia = false;
					break;
				}
			}
			
			
			System.out.println("Introduce genero M, F, X");
			char genero = entrada.next().charAt(0);
			
			
			atleta[i] = new Atleta(nombre, dni, año, altura, peso, genero, estudia);
			
			System.out.println(atleta[i].toString());
			
			entrada.nextLine();
		}
		
		
		
		
		
		
		
		
	}

}
