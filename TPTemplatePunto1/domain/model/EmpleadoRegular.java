package model;

import java.util.Objects;

public class EmpleadoRegular implements Rol {

	private Integer salario;

	public EmpleadoRegular(Integer salario) {
		this.salario = Objects.requireNonNull(salario);
	}

	@Override
	public Integer calcularMontoSalarial() {
		return salario;
	}

}
