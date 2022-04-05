package Data;

public class FactoryCursaAmatori extends AbstractFactory {

	@Override
	public Cursa CreateCursa() {
		
		return new CursaAmatori(0, 0);
	}

}
