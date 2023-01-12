package Club;

import java.util.Scanner;

import Atleta.Atleta;

public class Club {

	Atleta[] at = new Atleta[6];
	
	for (int i = 0; i <= 6; i++) {
		System.out.println("Introduce datos atleta" + i + 1);

        System.out.print("Nombre: ");
        
		Scanner entrada = new Scanner;
		String nombre = entrada.Scanner;

        System.out.print("Apellidos: ");
        String apellidos = entrada.readline;

        System.out.print("DNI: ");
        String dni = br.readline;
        
        
        at[i] = new Atleta(nombre, apellidos, dni);

        System.out.println(at[i].toString());
	}
	
}
