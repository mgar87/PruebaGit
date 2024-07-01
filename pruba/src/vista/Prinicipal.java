package vista;

import modelo.Carro;

public class Prinicipal {

	public static void main(String[] args) {
		
		Carro miCarro = new Carro();
		
		miCarro.setMarca("Mazda");
		miCarro.setModelo("Mazda 3");
		miCarro.setAnio(2000);

		
		System.out.println(miCarro.getMarca());
		
	}

}
