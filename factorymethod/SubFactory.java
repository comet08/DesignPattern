package factorymethod;

public class SubFactory extends InstrumentFactory{
	protected Instrument create(String name) {
		switch(name) {
		case "Ŭ�󸮳�":
			return new Clarinet();
		case "�÷�":
			return new Flute();
		default:
			return null;
		}
	}
}
