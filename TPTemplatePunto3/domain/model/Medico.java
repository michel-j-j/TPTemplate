package model;

import java.util.Objects;

public class Medico implements Seguro {

	private Float costo;

	public Medico(Float costo) {
		this.costo = Objects.requireNonNull(costo);
	}

	@Override
	public Float calcularDescuento() {
		return costo;
	}

}
