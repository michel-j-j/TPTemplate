
public class Main {

	public static void main(String[] args) {
		Remera importada = new Importada((double) 200, 0.25, 0.08, (double) 0);
		Remera nacional = new Nacional((double) 200, 0.15, 0.015, 0.20);

		System.out.println(importada.calcularPrecioVenta());
		System.out.println(nacional.calcularPrecioVenta());

	}

}
