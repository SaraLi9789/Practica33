package Libro;

public class LibroPrueba {

	public static void main(String[] args) {
		Libro libro1=new Libro (00001, " A traves de mi ventana ", " Ariadna godoy ", 414);
		Libro libro2=new Libro (00002, " Antes de Diciembre ", " Joana marcus ", 520);
		
		
		
		if (libro1.getNumeroPaginas()>libro2.getNumeroPaginas()) {
			System.out.println(libro1.getTitulo() + "Tiene mas paginas");
		}
		else {
			System.out.println(libro2.getTitulo() + "tiene mas paginas");
		}//ELSE
		
	}//MAIN

}//PUBLIC CLASS
