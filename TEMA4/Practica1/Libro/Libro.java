package Libro;

public class Libro {

	private int ISBN;
	private String Titulo;
	private String Autor;
	private int NumeroPaginas;
	
	public Libro() {
		
	}//LIBRO
	
	public Libro(int ISBN, String Titulo, String Autor, int NumeroPaginas ) {
		
		this.ISBN = ISBN;
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.NumeroPaginas = NumeroPaginas;
	}//PUBLICTHIS

	public int getISBN() {
		return ISBN;
	}//GETISBN

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}//SETISBN

	public String getTitulo() {
		return Titulo;
	}//GETTITULO

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}//SETTITULO

	public String getAutor() {
		return Autor;
	}//GETAUTOR

	public void setAutor(String autor) {
		Autor = autor;
	}//SETAUTOR

	public int getNumeroPaginas() {
		return NumeroPaginas;
	}//GETNUMEROPAGINAS

	public void setNumeroPaginas(int numeroPaginas) {
		NumeroPaginas = numeroPaginas;
	}//SETNUMEROPAGINAS

	@Override
	public String toString() {
		return "El Libro [Titulo=" + Titulo + ", con ISBN=" + ISBN + ", creadopor el Autor=" + Autor + ", tiene NumeroPaginas=" + NumeroPaginas
				+ "]";
	}//TOSTRING

	
	}//PUBLIC CLASS LIBRO
	
