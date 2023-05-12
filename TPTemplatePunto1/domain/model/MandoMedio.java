package model;

import java.util.List;
import java.util.Objects;

public class MandoMedio implements Rol {

	private List<Rol> lideresProyecto;
	private Integer salario;

	public MandoMedio(List<Rol> lideresProyecto, Integer salario) {
		this.salario = Objects.requireNonNull(salario);
		this.lideresProyecto = Objects.requireNonNull(lideresProyecto);
	}

	@Override
	public Integer calcularMontoSalarial() {
		Integer total = salario;
		for (Rol lideresProyecto : lideresProyecto) {
			total += lideresProyecto.calcularMontoSalarial();
		}
		return total;
	}
}
