package danielmendoza.giti7083s.pelota;

/**
 * 
 * @author dmendoza
 * Clase de Test Pelota
 *
 */

public class TestPelota {
	
	public static void main(String[] args) {
		Llanta llanta = new Llanta();
		PelotaFutbol pelota = new PelotaFutbol();
		llanta.rebotar();
		pelota.rebotar();
	}

}
