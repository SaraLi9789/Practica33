package DiaSemana;

public enum DiaSemana {

	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
	
	public static DiaSemana DiaEnXDias(DiaSemana dia, int dias) {
		DiaSemana nuevoDia;
		final int MAX = DiaSemana.values().length -1;
		int nuevo = dia.ordinal();
		for (int n=1; n<=dias; n++) {
			nuevo = nuevo +1;
			if (nuevo>MAX) nuevo=0;
		}
		
		nuevoDia =DiaSemana.values()[nuevo];
		return nuevoDia;
	}
}
