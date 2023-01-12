package DiaSemana;

public class DiaSemanaPrueba {

	public static void main(String[] args) {
	

		DiaSemana hoy = DiaSemana.DOMINGO;
		
		System.out.println(hoy.ordinal());
		
		int numDias = 150;
		
		DiaSemana futuro = DiaSemana.DiaEnXDias(hoy, numDias);
		
		System.out.printf("Dentro de %d dias será %s" , numDias, futuro);
		
	}

}
