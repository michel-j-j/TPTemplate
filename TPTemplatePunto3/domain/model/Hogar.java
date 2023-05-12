package model;

import java.util.Objects;

public class Hogar implements Seguro {
	private Float costo;

	public Hogar(Float costo) {
		this.costo = Objects.requireNonNull(costo);
	}

	@Override
	public Float calcularDescuento() {
		return costo;
	}

}
