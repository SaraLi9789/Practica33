package Atleta;

public class Atleta {

	private String dni;
	private String nombre;
	private int año;
	private float altura;
	private int peso;
	private char genero;
	private boolean estudio;
	
	
	public enum genero{
		M,
		F,
		X;
		
	}
	
	public Atleta(String dni, String nombre, int año, float altura, int peso, char genero, boolean estudio ) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.año = año;
		this.altura = altura;
		this.peso = peso;
		this.genero = genero;
		comprobargenero(genero);
		this.estudio = estudio;
		
	}
	
	public void comprobargenero(char genero) {
		if(genero != 'M' && genero != 'F' && genero !='X') {
			this.genero = genero;
			
		}		
	}
	
	
	@Override
	public String toString() {
		return "Atleta [dni=" + dni + ", nombre=" + nombre + ", año=" + año + ", altura=" + altura + ", peso=" + peso
				+ ", estudio=" + estudio + "]";
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isEstudio1() {
		return estudio;
	}

	public void setEstudio(boolean estudio) {
		this.estudio = estudio;
	}
	
	
	public void Imprimir() {
		System.out.println("Nombre del atleta" + nombre);
		System.out.println("Año del atleta" + año);
		System.out.println("Altura del atleta" + altura);
		System.out.println("peso del atleta" + peso);
		System.out.println("Genero del atleta" + genero);
	}
	
}