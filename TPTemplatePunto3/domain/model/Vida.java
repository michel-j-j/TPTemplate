package model;

import java.util.Objects;

public class Vida implements Seguro {

	private Float costo;

	public Vida(Float costo) {
		this.costo = Objects.requireNonNull(costo);
	}

	@Override
	public Float calcularDescuento() {
		return costo;
	}
}
