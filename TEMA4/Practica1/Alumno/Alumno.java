package Alumno;

import java.util.Objects;

//CLASE ALUMNO
public class Alumno {

	private String nombre;
	private String apellidos;
	private int nota;
	
	
	//CONSTRUCTOR VACIO
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellidos, int nota) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
		
	}//ALUMNO
	
	//CONSTRUCTOR TOSTRING
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", nota=" + nota + "]";
	}//TOSTRING

	
	public String getNombre() {
		return nombre;
	}//GETNOMBRE

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//SETNOMBRE
	
	public String getApellidos() {
		return apellidos;
	}//GETAPELLIDOS

	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}//SETAPELLIDOS
	
	public double getNota() {
		return nota;
	}//GETNOTAPARCIAL

	public void setNota(int nota) {
		this.nota = nota;
	}//SETNOTAPARCIAL
	
	

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}


		
	}


