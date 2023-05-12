package model;

abstract class Calculador {
	protected LogTransaction log;
	protected Integer mesEnPromocion;

	public Calculador(LogTransaction log, Integer mesEnPromocion) {
		this.log = log;
		this.mesEnPromocion = mesEnPromocion;
	}

	Double calcularPrecio(Double precioProducto) {
		Double precioTotal = precioProducto;
		precioTotal += precioProducto * porcentaje();
		ImprimirNombre();
		return precioTotal;
	}

	abstract Boolean MesDePromocion();

	abstract Double porcentaje();

	abstract void ImprimirNombre();

}