package factorymethod;

public class SubFactory extends InstrumentFactory{
	protected Instrument create(String name) {
		switch(name) {
		case "클라리넷":
			return new Clarinet();
		case "플룻":
			return new Flute();
		default:
			return null;
		}
	}
}
