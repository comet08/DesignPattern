package abstractfactory;

public class FactoryFactory{
	public static CutlerySetFactory getFactory(String name){
		switch(name) {
		case "A":
			return new AFactory();
		case "B":
			return new BFactory();
		default:
			return null;
		}
		
	}
}