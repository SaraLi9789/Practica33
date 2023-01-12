package Cuenta;

public class Cuenta {

	//ATRIBUTOS
	private String titular;
	private double cantidad;
	
	
	//CONSTRUCTORES
	public Cuenta(){
		
		
	}
	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
		
		
	}
	
	//METODOS
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "El titular " + titular + ", Tiene " +  cantidad + " euros";
	}

	//METODO INGRESAR
	public void ingresar(double cantidad) {
		if (cantidad >0 ) {
			this.cantidad = cantidad;
		}
	}

	//METODO RETIRAR
	public void retirar(double cantidad) {
		if (this.cantidad - cantidad <0) {
			this.cantidad =0;
		}
		else {
			this.cantidad = cantidad;
		}
	}
	
}
