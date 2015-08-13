package observer;

import java.util.Date;

public class ChegadaAniversarianteEvent {
	
	private final Date horaDaChegada;

	public ChegadaAniversarianteEvent(Date horaDaChegada) {
		super();
		this.horaDaChegada = horaDaChegada;
	}

	public Date getHoraDaChegada() {
		return horaDaChegada;
	}
}