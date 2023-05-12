import java.util.Objects;

public abstract class Remera {
	protected Double precio;
	protected Double recargoComercio;
	protected Double impuesto;
	protected Double bonificacion;

	Remera(Double precio, Double recargoComerco, Double impuesto, Double bonificacion) {
		this.precio = Objects.requireNonNull(precio);
		this.recargoComercio = Objects.requireNonNull(recargoComerco);
		this.impuesto = Objects.requireNonNull(impuesto);
		this.bonificacion = Objects.requireNonNull(bonificacion);
	}

	Double calcularPrecioVenta() {
		
		precio += Impuesto() - Bonificacion();
		System.out.println(precio);
		precio += ImpuestoPrecioFinal();
		return precio;
	}

	abstract Double ImpuestoPrecioFinal();

	abstract Double Bonificacion();

	abstract Double Impuesto();

}
