package model;

import java.util.List;
import java.util.Objects;

public class LiderProyecto implements Rol {

	private List<Rol> empleadosRegulares;
	private Integer salario;

	public LiderProyecto(List<Rol> empleadosRegulares, Integer salario) {
		this.salario = Objects.requireNonNull(salario);
		this.empleadosRegulares = Objects.requireNonNull(empleadosRegulares);
	}

	@Override
	public Integer calcularMontoSalarial() {
		Integer total = salario;
		for (Rol empleadosRegulares : empleadosRegulares) {
			total += empleadosRegulares.calcularMontoSalarial();
		}
		return total;
	}

}
