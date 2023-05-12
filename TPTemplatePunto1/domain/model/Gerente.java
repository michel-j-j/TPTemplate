package model;

import java.util.List;
import java.util.Objects;

public class Gerente implements Rol {

	private List<Rol> mandosMedio;
	private Integer salario;

	public Gerente(List<Rol> mandosMedio, Integer salario) {
		this.salario = Objects.requireNonNull(salario);
		this.mandosMedio = Objects.requireNonNull(mandosMedio);
	}

	@Override
	public Integer calcularMontoSalarial() {
		Integer total = salario;
		for (Rol gerente : mandosMedio) {
			total += gerente.calcularMontoSalarial();
		}
		return total;
	}

}
