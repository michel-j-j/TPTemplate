package model;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {

	TipoCalculador tipo = TipoCalculador.CalculadorNoJubilado;

	public CalculadorNoJubilado(LogTransaction log, Integer mesEnPromocion) {
		super(log, mesEnPromocion);
	}

	@Override
	Boolean MesDePromocion() {
		return of(mesEnPromocion).equals(now().getMonth());
	}

	@Override
	void ImprimirNombre() {
		log.log(tipo.name());
	}

	@Override
	Double porcentaje() {
		if (MesDePromocion())
			return 0.15;
		return 0.21;
	}
}
