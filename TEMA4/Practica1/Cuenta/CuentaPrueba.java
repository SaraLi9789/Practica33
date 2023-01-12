package Cuenta;

public class CuentaPrueba {

	public static void main(String[] args) {
		
		
		
		Cuenta cuenta1 = new Cuenta("Sara", 900);
		Cuenta cuenta2 = new Cuenta ("Sara", 600);
		Cuenta cuenta3 = new Cuenta ("Juan", 200);
		
		cuenta1.ingresar(900);
		cuenta2.ingresar(300);
		cuenta3.ingresar(500);
	
		
		cuenta1.retirar(300);
		cuenta2.retirar(200);
		cuenta3.retirar(100);
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		
	}

	
}
