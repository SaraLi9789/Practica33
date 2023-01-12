package Asignatura;


public class Aplicacion {

	public static void main(String[] args) {
		
		Alumno estudiante1 = new Alumno("Pedro", 18);
		Alumno estudiante2 = new Alumno("Carlos", 20);
		Alumno estudiante3 = new Alumno("Silvia", 22);
		
		estudiante1.materiaAsig(new Asignatura("Programacion", 7));
		estudiante1.materiaAsig(new Asignatura("Sistemas", 10));
		estudiante1.materiaAsig(new Asignatura("FOL", 9));
		estudiante1.materiaAsig(new Asignatura("Entornos desarrollo", 5));
		estudiante1.materiaAsig(new Asignatura("Lenguaje de Marcas", 8));
		estudiante1.materiaAsig(new Asignatura("Base de datos", 7));
		
		estudiante2.materiaAsig(new Asignatura("Programacion", 5));
		estudiante2.materiaAsig(new Asignatura("Sistemas", 10));
		estudiante2.materiaAsig(new Asignatura("FOL", 10));
		estudiante2.materiaAsig(new Asignatura("Entornos desarrollo", 6));
		estudiante2.materiaAsig(new Asignatura("Lenguaje de Marcas", 9));
		estudiante2.materiaAsig(new Asignatura("Base de datos", 7));
		
		estudiante3.materiaAsig(new Asignatura("Programacion", 4));
		estudiante3.materiaAsig(new Asignatura("Sistemas", 6));
		estudiante3.materiaAsig(new Asignatura("FOL", 5));
		estudiante3.materiaAsig(new Asignatura("Entornos desarrollo", 5));
		estudiante3.materiaAsig(new Asignatura("Lenguaje de Marcas", 3));
		estudiante3.materiaAsig(new Asignatura("Base de datos", 7));
		

		System.out.println("" + estudiante1 +"\n"+estudiante2 +"\n" +estudiante3);
	}
	
	

}
