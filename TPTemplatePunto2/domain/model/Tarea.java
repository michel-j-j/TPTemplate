package model;

import java.util.Objects;

public class Tarea implements Item {
	private Integer tiempo;

	public Tarea(Integer tiempo) {
		this.tiempo = Objects.requireNonNull(tiempo);
	}

	@Override
	public Integer calcularTimepo() {
		return tiempo;
	}

}
