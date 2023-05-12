package model;

import java.util.Objects;

public class Automovil implements Seguro {

	private Float costo;

	public Automovil(Float costo) {
		this.costo = Objects.requireNonNull(costo);
	}

	@Override
	public Float calcularDescuento() {
		return costo;
	}

}
