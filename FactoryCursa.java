package Data;

public class FactoryCursa extends AbstractFactory {

	
	public Cursa CreateCursa() {
		
		return new Cursa(0, 0);
	}

}
