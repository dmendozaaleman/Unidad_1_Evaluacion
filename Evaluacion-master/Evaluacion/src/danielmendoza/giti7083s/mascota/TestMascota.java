package danielmendoza.giti7083s.mascota;
/**
 * @author dmendoza
 * clase Test
 */
public class TestMascota {
	public static void main(String[] args) {
		Gato gato = new Gato();
		Leon leon = new Leon();
		Perro perro = new Perro();
		gato.lamer();
		leon.rugir();
		perro.lamer();
	}
}
