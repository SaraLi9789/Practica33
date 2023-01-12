package Alumno;

import java.util.Scanner;

public class AlumnoPrueba {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe cuantos alumnos hay");
		int i = entrada.nextInt();
		Alumno alumno[] = new Alumno[i];
		Scanner entrada2 = new Scanner(System.in);
		for (int contador=0; contador<i; contador++) {
			alumno[contador] = new Alumno();
			
			System.out.println("Nombre del Alumno " + (contador+1));
			String nombre = entrada2.nextLine();
			alumno [contador].setNombre(nombre);
			
			
			System.out.println("Apellido del Alumno" + (contador +1));
			String apellidos = entrada2.nextLine();
			alumno [contador].setApellidos(apellidos);
			
			System.out.println("Nota del Alumno" + (contador +1));
			int nota = entrada2.nextInt();
			alumno [contador].setNota(nota);
			
			
			
			System.out.println(alumno[contador].toString());
			
			entrada2.nextLine();
		}
		entrada.close();
		entrada2.close();
		
		
	}
	



}
