package danielmendoza.giti7083s.pelota;

/**
 * 
 * @author dmendoza
 * Clase LLanta
 *
 */

public class Llanta implements Rebotable{
	private int factorRebote;

	@Override
	public void rebotar() {
		System.out.println("Rebotar");
	}

	@Override
	public void setfactorRebote(int factorRebote) {
		this.factorRebote = factorRebote;
		
	}
	

}
