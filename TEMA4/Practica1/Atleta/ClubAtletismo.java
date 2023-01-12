package Atleta;

import java.util.Arrays;

public class ClubAtletismo {

	private Atleta atleta[] = new Atleta[10];
	

	public ClubAtletismo(Atleta[] atleta) {
		super();
		this.atleta = atleta;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("ClubAtletismo [atleta=");
		buffer.append(Arrays.toString(atleta));
		buffer.append(", toString()=");
		buffer.append(super.toString());
		buffer.append("]");
		return buffer.toString();
	}

	

	
	
}
