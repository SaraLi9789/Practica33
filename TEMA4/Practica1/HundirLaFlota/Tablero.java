package HundirLaFlota;

public class Tablero {
	
	private char [][] Tablero;
	private int tamaño;
	public int cuadro;
	
	public Tablero(int tamaño) {
        this.Tablero = new char[tamaño][tamaño];
        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero.length; j++) {
                Tablero[i][j] = ' ';
            }
        }
    }

    public Tablero() {
    }

	public char[][] getTablero() {
		return Tablero;
	}

	public void setTablero(char[][] tablero) {
		Tablero = tablero;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getCasilla(int x, int y) {
		cuadro = Tablero[x][y];
		return cuadro;
	}

	public void setCuadro(int x, int y, int valor) {
		Tablero[x][y] = (char) valor;
	}
	
	public class Barco{
		
		private char [] x;
		private char [] y;
	}
	

		
	}
