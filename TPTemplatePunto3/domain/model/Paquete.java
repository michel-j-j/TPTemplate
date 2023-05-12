package model;

import java.util.List;
import java.util.Objects;

public class Paquete implements Seguro {

	private List<Seguro> seguros;
	private Float descuento;

	public Paquete(List<Seguro> seguros, Float descuento) {
		this.seguros = Objects.requireNonNull(seguros);
		this.descuento = Objects.requireNonNull(descuento);
	}

	@Override
	public Float calcularDescuento() {
		Integer acumular = 1;
		Float total = (float) 0;
		for (Seguro seguro : seguros) {
			total += seguro.calcularDescuento();
			acumular++;
		}
		return aplicarDescuento(total, descuento * acumular);
	}

	private Float aplicarDescuento(Float total, Float descuento) {
		if (descuento != 0) {
			descuento = descuento / 100;
			total = total * (1 - descuento);
			return total;
		}
		throw new RuntimeException("El descuento debe ser distinto de 0.");
	}

}
