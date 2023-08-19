package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String  marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		if(asientos.length<=4) {
			return asientos.length;
		}else {
			return false;
		}
	}
	
	String verificarIntegridad() {
		if(motor.registro == registro) {
			for(int i =0;i<asientos.length;i++) {
				if(asientos[i].registro !=registro) {
					return "Las piezas no son originales";
				}
			}
		}
		return "Auto original";
	}
}

