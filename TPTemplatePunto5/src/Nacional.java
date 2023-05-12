
public class Nacional extends Remera {

	Nacional(Double precio, Double recargoComerco, Double impuesto, Double bonificacion) {
		super(precio, recargoComerco, impuesto, bonificacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	Double ImpuestoPrecioFinal() {
		return precio * recargoComercio;
	}

	@Override
	Double Bonificacion() {
		return precio * bonificacion;
	}

	@Override
	Double Impuesto() {
		// TODO Auto-generated method stub
		return precio * impuesto;
	}

}
