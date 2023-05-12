
public class Importada extends Remera {

	Importada(Double precio, Double recargoComerco, Double impuesto, Double bonificacion) {
		super(precio, recargoComerco, impuesto, bonificacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	Double ImpuestoPrecioFinal() {
		return precio * recargoComercio;
	}

	@Override
	Double Bonificacion() {
		return (double) bonificacion;
	}

	@Override
	Double Impuesto() {

		return precio * impuesto;
	}

}
