package model;

import java.util.Objects;

public class Spike implements Item {

	private Integer tiempo;

	public Spike(Integer tiempo) {
		this.tiempo = Objects.requireNonNull(tiempo);
	}

	@Override
	public Integer calcularTimepo() {
		return tiempo;
	}

}
