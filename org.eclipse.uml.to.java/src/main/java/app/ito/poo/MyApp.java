package app.ito.poo;

import java.time.LocalDate;
import Clases.ito.poo.CuentaBancaria;

public class MyApp {

	static void run() {
		System.out.println(new CuentaBancaria(89333L, "Lucia Mendoza", 115000, LocalDate.of(2021, 2, 18)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();

	}

}
