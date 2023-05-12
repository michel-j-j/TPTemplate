package model;

public class Main {

	public static void main(String[] args) {

		Calculador calculadorNoJubi = new CalculadorNoJubilado(new LogTransaction(), 2);
		Calculador calculadorJubi = new CalculadorJubilado(new LogTransaction(), 2);

		System.out.println(calculadorNoJubi.calcularPrecio((double) 200));
		System.out.println(calculadorJubi.calcularPrecio((double) 200));

	}

}
