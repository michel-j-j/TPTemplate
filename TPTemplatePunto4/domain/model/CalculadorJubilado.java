package model;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {

	TipoCalculador tipo = TipoCalculador.CalculadorJubilado;

	public CalculadorJubilado(LogTransaction log, Integer mesEnPromocion) {
		super(log, mesEnPromocion);
	}

	@Override
	Boolean MesDePromocion() {
		// TODO Auto-generated method stub
		return of(mesEnPromocion).equals(now().getMonth());
	}

	@Override
	void ImprimirNombre() {
		log.log(tipo.name());
	}

	@Override
	Double porcentaje() {
		if (!MesDePromocion())
			return 0.1;
		return (double) 1;
	}
}
