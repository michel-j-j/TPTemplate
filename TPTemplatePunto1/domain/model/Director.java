package model;

import java.util.List;
import java.util.Objects;

public class Director implements Rol {

	private List<Rol> gerentes;
	private Integer salario;

	public Director(List<Rol> gerentes, Integer salario) {
		this.salario = Objects.requireNonNull(salario);
		this.gerentes = Objects.requireNonNull(gerentes);
	}

	@Override
	public Integer calcularMontoSalarial() {
		Integer total = salario;
		for (Rol gerente : gerentes) {
			total += gerente.calcularMontoSalarial();
		}
		return total;
	}

}
