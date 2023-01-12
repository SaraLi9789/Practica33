package TresEnRaya;

public class Tablero {

	private char[][] Tablero = new char [3][3];
	private int x = 0;
	private int y = 0;
	private char Jugador1 = 'O';
	private char Jugador2 = 'X';
	
	
	public Tablero(){
	
}

	public char[][] getTablero() {
		return Tablero;
	}

	public void setTablero(char[][] tablero) {
		Tablero = tablero;
	}
	
	public void ImprimirTablero() {
		for (int fila=0; fila<Tablero.length; fila++) {
			for (int columna=0; columna<Tablero.length; columna++) {
				System.out.println(Tablero[fila][columna]);
			}
			System.out.println("");
		}
	}

	
public class Ficha{
	private String ficha;
	
	public Ficha() {
		
	}
	
	public Ficha(String ficha) {
		this.ficha = ficha;
	}

	public String getFicha() {
		return ficha;
	}

	public void setFicha(String ficha) {
		this.ficha = ficha;
	}
	
}
public class jugador{
	
private String jugador;


public String getJugador() {
	return jugador;
}

public void setJugador(String jugador) {
	this.jugador = jugador;
}

public boolean ConsultarPosicion(int fila, int columna) {
	if (fila >0 && fila <Tablero.length && columna >0 && columna <Tablero.length ) {
		return false;
	}
	return false;
}

}
}