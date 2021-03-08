package factorymethod;

public abstract class InstrumentFactory {
	public InstrumentFactory() {}
	abstract protected Instrument create(String name);
	public Instrument newInstrument(String name) {
		Instrument instrument = create(name);
		return instrument;
	}
}
